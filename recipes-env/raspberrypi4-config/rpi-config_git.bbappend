# ACTIVATE_I2C
ENABLE_I2C = "1"

# GPU memory
GPU_MEM_1024 = "1"

# Remove Splash
DISABLE_SPLASH = "1"


do_deploy:append() {
    echo "# Install dtbo for waveshare 7.9inch LCD" >> $CONFIG
    echo "dtoverlay=vc4-kms-dsi-waveshare-panel,7_9_inch" >> $CONFIG

    echo "#90°" >> $CONFIG
    echo "dtoverlay=WS_xinchDSI_Touch,invertedy,swappedxy" >> $CONFIG
}

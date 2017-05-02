split -a 4 -d -l 1000000 codes base/base.dat.

foreach f in base.dat.0*                                                                                                                                    [23:08:26]
do
  echo "" > output/$f
done
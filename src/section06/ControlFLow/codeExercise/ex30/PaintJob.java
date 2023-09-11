package section06.ControlFLow.codeExercise.ex30;

public class PaintJob {
        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1; // Invalid input
            }

            double wallArea = width * height;
            int requiredBuckets = (int) Math.ceil(wallArea / areaPerBucket);

            return requiredBuckets - extraBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1; // Invalid input
            }

            double wallArea = width * height;
            int requiredBuckets = (int) Math.ceil(wallArea / areaPerBucket);

            return requiredBuckets;
        }

        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1; // Invalid input
            }

            int requiredBuckets = (int) Math.ceil(area / areaPerBucket);

            return requiredBuckets;
        }

    }
}

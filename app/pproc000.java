package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pproc000 extends GXProcedure
{
   public pproc000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pproc000.class ), "" );
   }

   public pproc000( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV22Tab_procesos ,
                             String[] aP5 )
   {
      pproc000.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, AV22Tab_procesos, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] AV22Tab_procesos ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, AV22Tab_procesos, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV22Tab_procesos ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pproc000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pproc000.this.AV19Barcod = aP1[0];
      this.aP1 = aP1;
      pproc000.this.AV20Barcodreo = aP2[0];
      this.aP2 = aP2;
      pproc000.this.AV21barcodpar = aP3[0];
      this.aP3 = aP3;
      pproc000.this.AV22Tab_procesos = AV22Tab_procesos;
      pproc000.this.AV23UsurCod = aP5[0];
      this.aP5 = aP5;
      pproc000.this.AV24Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25i = (short)(1) ;
      while ( AV25i <= 10 )
      {
         if ( GXutil.strcmp(AV22Tab_procesos[AV25i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV28Procod = AV22Tab_procesos[AV25i-1] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV19Barcod ;
         GXv_int3[0] = AV20Barcodreo ;
         GXv_char4[0] = AV21barcodpar ;
         GXv_char5[0] = AV28Procod ;
         GXv_int6[0] = AV26Alta_r ;
         GXv_int7[0] = AV27Pq_ok ;
         new app.pdt9000(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
         pproc000.this.A396EmprCod = GXv_char1[0] ;
         pproc000.this.AV19Barcod = GXv_int2[0] ;
         pproc000.this.AV20Barcodreo = GXv_int3[0] ;
         pproc000.this.AV21barcodpar = GXv_char4[0] ;
         pproc000.this.AV28Procod = GXv_char5[0] ;
         pproc000.this.AV26Alta_r = GXv_int6[0] ;
         pproc000.this.AV27Pq_ok = GXv_int7[0] ;
         AV25i = (short)(AV25i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pproc000.this.A396EmprCod;
      this.aP1[0] = pproc000.this.AV19Barcod;
      this.aP2[0] = pproc000.this.AV20Barcodreo;
      this.aP3[0] = pproc000.this.AV21barcodpar;
      this.aP5[0] = pproc000.this.AV23UsurCod;
      this.aP6[0] = pproc000.this.AV24Station;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Procod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Barcodreo ;
   private byte GXv_int3[] ;
   private byte AV26Alta_r ;
   private byte GXv_int6[] ;
   private short AV25i ;
   private short AV27Pq_ok ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV19Barcod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV21barcodpar ;
   private String AV22Tab_procesos[] ;
   private String AV23UsurCod ;
   private String AV24Station ;
   private String AV28Procod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP5 ;
}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppensl10 extends GXProcedure
{
   public ppensl10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppensl10.class ), "" );
   }

   public ppensl10( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppensl10.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      ppensl10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppensl10.this.AV20Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV15Informe1 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HOJLAB", ""), GXv_int2) ;
      ppensl10.this.GXt_int1 = GXv_int2[0] ;
      AV15Informe1 = GXt_int1 ;
      GXt_int1 = AV17Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      ppensl10.this.GXt_int1 = GXv_int2[0] ;
      AV17Erfoc = GXt_int1 ;
      GXt_int1 = AV18Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      ppensl10.this.GXt_int1 = GXv_int2[0] ;
      AV18Carvema = GXt_int1 ;
      Gx_msg = httpContext.getMessage( "Numero de Opciones=", "") + GXutil.str( AV11Num_op, 4, 0) ;
      System.out.println( Gx_msg );
      AV13Pp = httpContext.getMessage( "N", "") ;
      if ( ( AV17Erfoc == 1 ) || ( AV18Carvema == 1 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV20Lb_numero ;
         GXv_int5[0] = AV11Num_op ;
         GXv_char6[0] = AV13Pp ;
         new app.rensl10t(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, AV12Tab_opcion, GXv_char6) ;
         ppensl10.this.A396EmprCod = GXv_char3[0] ;
         ppensl10.this.AV20Lb_numero = GXv_int4[0] ;
         ppensl10.this.AV11Num_op = GXv_int5[0] ;
         ppensl10.this.AV13Pp = GXv_char6[0] ;
      }
      else
      {
         if ( AV15Informe1 == 0 )
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = AV20Lb_numero ;
            GXv_int5[0] = AV11Num_op ;
            GXv_char3[0] = AV13Pp ;
            new app.rensl10n(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, AV12Tab_opcion, GXv_char3) ;
            ppensl10.this.A396EmprCod = GXv_char6[0] ;
            ppensl10.this.AV20Lb_numero = GXv_int4[0] ;
            ppensl10.this.AV11Num_op = GXv_int5[0] ;
            ppensl10.this.AV13Pp = GXv_char3[0] ;
         }
         else
         {
            if ( AV16TipoForm == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_int4[0] = AV20Lb_numero ;
               GXv_int5[0] = AV11Num_op ;
               GXv_char3[0] = AV13Pp ;
               new app.rensl10q(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, AV12Tab_opcion, GXv_char3) ;
               ppensl10.this.A396EmprCod = GXv_char6[0] ;
               ppensl10.this.AV20Lb_numero = GXv_int4[0] ;
               ppensl10.this.AV11Num_op = GXv_int5[0] ;
               ppensl10.this.AV13Pp = GXv_char3[0] ;
            }
            else
            {
               if ( GXutil.strcmp(AV13Pp, httpContext.getMessage( "S", "")) == 0 )
               {
                  GXv_char6[0] = A396EmprCod ;
                  GXv_int4[0] = AV20Lb_numero ;
                  GXv_int5[0] = AV11Num_op ;
                  GXv_char3[0] = AV13Pp ;
                  new app.renspipet(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, AV12Tab_opcion, GXv_char3) ;
                  ppensl10.this.A396EmprCod = GXv_char6[0] ;
                  ppensl10.this.AV20Lb_numero = GXv_int4[0] ;
                  ppensl10.this.AV11Num_op = GXv_int5[0] ;
                  ppensl10.this.AV13Pp = GXv_char3[0] ;
               }
               else
               {
                  GXv_char6[0] = A396EmprCod ;
                  GXv_int4[0] = AV20Lb_numero ;
                  GXv_int5[0] = AV11Num_op ;
                  GXv_char3[0] = AV13Pp ;
                  new app.rensl10t(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, AV12Tab_opcion, GXv_char3) ;
                  ppensl10.this.A396EmprCod = GXv_char6[0] ;
                  ppensl10.this.AV20Lb_numero = GXv_int4[0] ;
                  ppensl10.this.AV11Num_op = GXv_int5[0] ;
                  ppensl10.this.AV13Pp = GXv_char3[0] ;
               }
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppensl10.this.A396EmprCod;
      this.aP1[0] = ppensl10.this.AV20Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      Gx_msg = "" ;
      AV13Pp = "" ;
      AV12Tab_opcion = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12Tab_opcion[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char6 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new short[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Informe1 ;
   private byte AV17Erfoc ;
   private byte AV18Carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV16TipoForm ;
   private short AV11Num_op ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV20Lb_numero ;
   private int GXv_int4[] ;
   private int GX_I ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV13Pp ;
   private String AV12Tab_opcion[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private int[] aP1 ;
   private String[] aP0 ;
}


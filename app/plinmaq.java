package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinmaq extends GXProcedure
{
   public plinmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinmaq.class ), "" );
   }

   public plinmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      plinmaq.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      plinmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plinmaq.this.AV14BarCod = aP1[0];
      this.aP1 = aP1;
      plinmaq.this.AV15BarCodReo = aP2[0];
      this.aP2 = aP2;
      plinmaq.this.AV16BarCodPar = aP3[0];
      this.aP3 = aP3;
      plinmaq.this.AV8MaqCod = aP4[0];
      this.aP4 = aP4;
      plinmaq.this.AV9Volumen = aP5[0];
      this.aP5 = aP5;
      plinmaq.this.AV10RecLinMaq = aP6[0];
      this.aP6 = aP6;
      plinmaq.this.AV11MenPan = aP7[0];
      this.aP7 = aP7;
      plinmaq.this.AV18OkMod = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN090", ""), (byte)(99), GXv_char2) ;
      plinmaq.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit1 = GXt_char1 ;
      AV12No_recetas = (short)(0) ;
      AV17Linea = (short)(0) ;
      /* Using cursor P01JN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01JN2_A130BarCodPar[0] ;
         A132BarCodReo = P01JN2_A132BarCodReo[0] ;
         A129BarCod = P01JN2_A129BarCod[0] ;
         A6039RecAcab = P01JN2_A6039RecAcab[0] ;
         n6039RecAcab = P01JN2_n6039RecAcab[0] ;
         A2804RecLinMaq = P01JN2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV12No_recetas = (short)(1) ;
         }
         AV17Linea = A2804RecLinMaq ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12No_recetas == 0 )
      {
         AV10RecLinMaq = (short)(AV17Linea+10) ;
         AV11MenPan = AV13Lit1 ;
         AV18OkMod = httpContext.getMessage( "S", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinmaq.this.A396EmprCod;
      this.aP1[0] = plinmaq.this.AV14BarCod;
      this.aP2[0] = plinmaq.this.AV15BarCodReo;
      this.aP3[0] = plinmaq.this.AV16BarCodPar;
      this.aP4[0] = plinmaq.this.AV8MaqCod;
      this.aP5[0] = plinmaq.this.AV9Volumen;
      this.aP6[0] = plinmaq.this.AV10RecLinMaq;
      this.aP7[0] = plinmaq.this.AV11MenPan;
      this.aP8[0] = plinmaq.this.AV18OkMod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Lit1 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P01JN2_A396EmprCod = new String[] {""} ;
      P01JN2_A130BarCodPar = new String[] {""} ;
      P01JN2_A132BarCodReo = new byte[1] ;
      P01JN2_A129BarCod = new int[1] ;
      P01JN2_A6039RecAcab = new String[] {""} ;
      P01JN2_n6039RecAcab = new boolean[] {false} ;
      P01JN2_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinmaq__default(),
         new Object[] {
             new Object[] {
            P01JN2_A396EmprCod, P01JN2_A130BarCodPar, P01JN2_A132BarCodReo, P01JN2_A129BarCod, P01JN2_A6039RecAcab, P01JN2_n6039RecAcab, P01JN2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15BarCodReo ;
   private byte A132BarCodReo ;
   private short AV10RecLinMaq ;
   private short AV12No_recetas ;
   private short AV17Linea ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV14BarCod ;
   private int AV9Volumen ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV16BarCodPar ;
   private String AV8MaqCod ;
   private String AV11MenPan ;
   private String AV18OkMod ;
   private String AV13Lit1 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01JN2_A396EmprCod ;
   private String[] P01JN2_A130BarCodPar ;
   private byte[] P01JN2_A132BarCodReo ;
   private int[] P01JN2_A129BarCod ;
   private String[] P01JN2_A6039RecAcab ;
   private boolean[] P01JN2_n6039RecAcab ;
   private short[] P01JN2_A2804RecLinMaq ;
}

final  class plinmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01JN2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}


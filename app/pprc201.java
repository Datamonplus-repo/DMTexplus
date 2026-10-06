package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc201 extends GXProcedure
{
   public pprc201( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc201.class ), "" );
   }

   public pprc201( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pprc201.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprc201.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc201.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      pprc201.this.AV12BarcodReo = aP2[0];
      this.aP2 = aP2;
      pprc201.this.AV13BarcodPar = aP3[0];
      this.aP3 = aP3;
      pprc201.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagReca = (byte)(0) ;
      AV9Hdraca = (byte)(0) ;
      Gx_msg = "" ;
      /* Using cursor P05RT2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarcodReo), AV13BarcodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P05RT2_A6039RecAcab[0] ;
         n6039RecAcab = P05RT2_n6039RecAcab[0] ;
         A130BarCodPar = P05RT2_A130BarCodPar[0] ;
         A132BarCodReo = P05RT2_A132BarCodReo[0] ;
         A129BarCod = P05RT2_A129BarCod[0] ;
         A396EmprCod = P05RT2_A396EmprCod[0] ;
         A2805RecVolPrd = P05RT2_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P05RT2_A2804RecLinMaq[0] ;
         AV8FlagReca = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( (0==AV8FlagReca) )
      {
         /* Execute user subroutine: 'HDRACA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV9Hdraca == 1 )
         {
            Gx_msg = httpContext.getMessage( "ATENCION: Esta Hdr ", "") + GXutil.str( AV11BarCod, 8, 0) + "-" + GXutil.str( AV12BarcodReo, 1, 0) + AV13BarcodPar + httpContext.getMessage( " esta agrupada con la Hdr ", "") + GXutil.str( AV14BarCod_p, 8, 0) + "-" + GXutil.str( AV15CodReo_p, 1, 0) + AV16CodPar + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Agrupacion de Hdrs ACABADO", "") + GXutil.newLine( ) ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV8FlagReca > 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado que la Hdr ", "") + GXutil.str( AV11BarCod, 8, 0) + "-" + GXutil.str( AV12BarcodReo, 1, 0) + AV13BarcodPar + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "tiene, Receta de Acabado.", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      AV9Hdraca = (byte)(0) ;
      AV14BarCod_p = 0 ;
      AV15CodReo_p = (byte)(0) ;
      AV16CodPar = "" ;
      /* Using cursor P05RT3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarcodReo), AV13BarcodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P05RT3_A396EmprCod[0] ;
         A6031Ac_Barcod = P05RT3_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = P05RT3_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = P05RT3_A6033Ac_BarPar[0] ;
         A129BarCod = P05RT3_A129BarCod[0] ;
         A132BarCodReo = P05RT3_A132BarCodReo[0] ;
         A130BarCodPar = P05RT3_A130BarCodPar[0] ;
         AV9Hdraca = (byte)(1) ;
         AV14BarCod_p = A129BarCod ;
         AV15CodReo_p = A132BarCodReo ;
         AV16CodPar = A130BarCodPar ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc201.this.AV10EmprCod;
      this.aP1[0] = pprc201.this.AV11BarCod;
      this.aP2[0] = pprc201.this.AV12BarcodReo;
      this.aP3[0] = pprc201.this.AV13BarcodPar;
      this.aP4[0] = pprc201.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05RT2_A6039RecAcab = new String[] {""} ;
      P05RT2_n6039RecAcab = new boolean[] {false} ;
      P05RT2_A130BarCodPar = new String[] {""} ;
      P05RT2_A132BarCodReo = new byte[1] ;
      P05RT2_A129BarCod = new int[1] ;
      P05RT2_A396EmprCod = new String[] {""} ;
      P05RT2_A2805RecVolPrd = new int[1] ;
      P05RT2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV16CodPar = "" ;
      P05RT3_A396EmprCod = new String[] {""} ;
      P05RT3_A6031Ac_Barcod = new int[1] ;
      P05RT3_A6032Ac_BarReo = new byte[1] ;
      P05RT3_A6033Ac_BarPar = new String[] {""} ;
      P05RT3_A129BarCod = new int[1] ;
      P05RT3_A132BarCodReo = new byte[1] ;
      P05RT3_A130BarCodPar = new String[] {""} ;
      A6033Ac_BarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc201__default(),
         new Object[] {
             new Object[] {
            P05RT2_A6039RecAcab, P05RT2_n6039RecAcab, P05RT2_A130BarCodPar, P05RT2_A132BarCodReo, P05RT2_A129BarCod, P05RT2_A396EmprCod, P05RT2_A2805RecVolPrd, P05RT2_A2804RecLinMaq
            }
            , new Object[] {
            P05RT3_A396EmprCod, P05RT3_A6031Ac_Barcod, P05RT3_A6032Ac_BarReo, P05RT3_A6033Ac_BarPar, P05RT3_A129BarCod, P05RT3_A132BarCodReo, P05RT3_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarcodReo ;
   private byte AV8FlagReca ;
   private byte AV9Hdraca ;
   private byte A132BarCodReo ;
   private byte AV15CodReo_p ;
   private byte A6032Ac_BarReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV14BarCod_p ;
   private int A6031Ac_Barcod ;
   private String AV10EmprCod ;
   private String AV13BarcodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV16CodPar ;
   private String A6033Ac_BarPar ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RT2_A6039RecAcab ;
   private boolean[] P05RT2_n6039RecAcab ;
   private String[] P05RT2_A130BarCodPar ;
   private byte[] P05RT2_A132BarCodReo ;
   private int[] P05RT2_A129BarCod ;
   private String[] P05RT2_A396EmprCod ;
   private int[] P05RT2_A2805RecVolPrd ;
   private short[] P05RT2_A2804RecLinMaq ;
   private String[] P05RT3_A396EmprCod ;
   private int[] P05RT3_A6031Ac_Barcod ;
   private byte[] P05RT3_A6032Ac_BarReo ;
   private String[] P05RT3_A6033Ac_BarPar ;
   private int[] P05RT3_A129BarCod ;
   private byte[] P05RT3_A132BarCodReo ;
   private String[] P05RT3_A130BarCodPar ;
}

final  class pprc201__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RT2", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05RT3", "SELECT EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclatp extends GXProcedure
{
   public pclatp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclatp.class ), "" );
   }

   public pclatp( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           short[] aP10 )
   {
      pclatp.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclatp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclatp.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclatp.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclatp.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclatp.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclatp.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclatp.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclatp.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclatp.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclatp.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclatp.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclatp.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV112Pizarro ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int2) ;
      pclatp.this.GXt_int1 = GXv_int2[0] ;
      AV112Pizarro = GXt_int1 ;
      AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
      AV78ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
      if ( AV112Pizarro == 0 )
      {
         /* Using cursor P01Q72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P01Q72_A130BarCodPar[0] ;
            A132BarCodReo = P01Q72_A132BarCodReo[0] ;
            A129BarCod = P01Q72_A129BarCod[0] ;
            A212BarSer = P01Q72_A212BarSer[0] ;
            A252CliCod = P01Q72_A252CliCod[0] ;
            n252CliCod = P01Q72_n252CliCod[0] ;
            AV79BarSer = A212BarSer ;
            AV52CliCod = A252CliCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P01Q73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV79BarSer, Short.valueOf(AV78ClasCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4295ClasCod = P01Q73_A4295ClasCod[0] ;
            n4295ClasCod = P01Q73_n4295ClasCod[0] ;
            A65ArtCod = P01Q73_A65ArtCod[0] ;
            A252CliCod = P01Q73_A252CliCod[0] ;
            n252CliCod = P01Q73_n252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01Q74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A44AlbRecCod = P01Q74_A44AlbRecCod[0] ;
            A130BarCodPar = P01Q74_A130BarCodPar[0] ;
            A132BarCodReo = P01Q74_A132BarCodReo[0] ;
            A129BarCod = P01Q74_A129BarCod[0] ;
            A4295ClasCod = P01Q74_A4295ClasCod[0] ;
            n4295ClasCod = P01Q74_n4295ClasCod[0] ;
            A200BarPieCod = P01Q74_A200BarPieCod[0] ;
            A4295ClasCod = P01Q74_A4295ClasCod[0] ;
            n4295ClasCod = P01Q74_n4295ClasCod[0] ;
            if ( A4295ClasCod == AV78ClasCod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclatp.this.A396EmprCod;
      this.aP1[0] = pclatp.this.AV15Descrip;
      this.aP2[0] = pclatp.this.AV16Clave;
      this.aP3[0] = pclatp.this.AV17PrdVal;
      this.aP4[0] = pclatp.this.AV18BarCod;
      this.aP5[0] = pclatp.this.AV19BarCodReo;
      this.aP6[0] = pclatp.this.AV20BarCodPar;
      this.aP7[0] = pclatp.this.AV21TotKil;
      this.aP8[0] = pclatp.this.AV22PrdDesc;
      this.aP9[0] = pclatp.this.AV23Accion;
      this.aP10[0] = pclatp.this.AV67BarLinMaq;
      this.aP11[0] = pclatp.this.AV111Opi;
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
      scmdbuf = "" ;
      P01Q72_A396EmprCod = new String[] {""} ;
      P01Q72_A130BarCodPar = new String[] {""} ;
      P01Q72_A132BarCodReo = new byte[1] ;
      P01Q72_A129BarCod = new int[1] ;
      P01Q72_A212BarSer = new String[] {""} ;
      P01Q72_A252CliCod = new int[1] ;
      P01Q72_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      AV79BarSer = "" ;
      P01Q73_A396EmprCod = new String[] {""} ;
      P01Q73_A4295ClasCod = new short[1] ;
      P01Q73_n4295ClasCod = new boolean[] {false} ;
      P01Q73_A65ArtCod = new String[] {""} ;
      P01Q73_A252CliCod = new int[1] ;
      P01Q73_n252CliCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P01Q74_A44AlbRecCod = new int[1] ;
      P01Q74_A396EmprCod = new String[] {""} ;
      P01Q74_A130BarCodPar = new String[] {""} ;
      P01Q74_A132BarCodReo = new byte[1] ;
      P01Q74_A129BarCod = new int[1] ;
      P01Q74_A4295ClasCod = new short[1] ;
      P01Q74_n4295ClasCod = new boolean[] {false} ;
      P01Q74_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclatp__default(),
         new Object[] {
             new Object[] {
            P01Q72_A396EmprCod, P01Q72_A130BarCodPar, P01Q72_A132BarCodReo, P01Q72_A129BarCod, P01Q72_A212BarSer, P01Q72_A252CliCod, P01Q72_n252CliCod
            }
            , new Object[] {
            P01Q73_A396EmprCod, P01Q73_A4295ClasCod, P01Q73_n4295ClasCod, P01Q73_A65ArtCod, P01Q73_A252CliCod
            }
            , new Object[] {
            P01Q74_A44AlbRecCod, P01Q74_A396EmprCod, P01Q74_A130BarCodPar, P01Q74_A132BarCodReo, P01Q74_A129BarCod, P01Q74_A4295ClasCod, P01Q74_n4295ClasCod, P01Q74_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte AV112Pizarro ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private short AV67BarLinMaq ;
   private short AV78ClasCod ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV52CliCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV79BarSer ;
   private String A65ArtCod ;
   private String A200BarPieCod ;
   private boolean n252CliCod ;
   private boolean n4295ClasCod ;
   private byte[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Q72_A396EmprCod ;
   private String[] P01Q72_A130BarCodPar ;
   private byte[] P01Q72_A132BarCodReo ;
   private int[] P01Q72_A129BarCod ;
   private String[] P01Q72_A212BarSer ;
   private int[] P01Q72_A252CliCod ;
   private boolean[] P01Q72_n252CliCod ;
   private String[] P01Q73_A396EmprCod ;
   private short[] P01Q73_A4295ClasCod ;
   private boolean[] P01Q73_n4295ClasCod ;
   private String[] P01Q73_A65ArtCod ;
   private int[] P01Q73_A252CliCod ;
   private boolean[] P01Q73_n252CliCod ;
   private int[] P01Q74_A44AlbRecCod ;
   private String[] P01Q74_A396EmprCod ;
   private String[] P01Q74_A130BarCodPar ;
   private byte[] P01Q74_A132BarCodReo ;
   private int[] P01Q74_A129BarCod ;
   private short[] P01Q74_A4295ClasCod ;
   private boolean[] P01Q74_n4295ClasCod ;
   private String[] P01Q74_A200BarPieCod ;
}

final  class pclatp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Q72", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q73", "SELECT EmprCod, ClasCod, ArtCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q74", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ClasCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}


package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apcvcolorcliente extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apcvcolorcliente pgm = new apcvcolorcliente (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apcvcolorcliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apcvcolorcliente.class ), "" );
   }

   public apcvcolorcliente( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apcvcolorcliente.this.AV10EmprCod = GXv_char1[0] ;
      apcvcolorcliente.this.AV11EmprNom = GXv_char2[0] ;
      apcvcolorcliente.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P060A2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P060A2_A361DisCod[0] ;
         A213BarSit = P060A2_A213BarSit[0] ;
         A396EmprCod = P060A2_A396EmprCod[0] ;
         A252CliCod = P060A2_A252CliCod[0] ;
         n252CliCod = P060A2_n252CliCod[0] ;
         A212BarSer = P060A2_A212BarSer[0] ;
         A135BarColNom = P060A2_A135BarColNom[0] ;
         A136BarColNum = P060A2_A136BarColNum[0] ;
         A218BarTipCol = P060A2_A218BarTipCol[0] ;
         A1234BarNomCli = P060A2_A1234BarNomCli[0] ;
         A1195DisNomCli = P060A2_A1195DisNomCli[0] ;
         A129BarCod = P060A2_A129BarCod[0] ;
         A132BarCodReo = P060A2_A132BarCodReo[0] ;
         A130BarCodPar = P060A2_A130BarCodPar[0] ;
         A1195DisNomCli = P060A2_A1195DisNomCli[0] ;
         GXv_char3[0] = "" ;
         GXv_char2[0] = "" ;
         GXv_int4[0] = (short)(0) ;
         GXv_int5[0] = (byte)(0) ;
         GXv_char1[0] = "" ;
         GXv_char6[0] = AV14ForNomcli ;
         GXv_int7[0] = 0 ;
         GXv_char8[0] = "" ;
         GXv_char9[0] = "" ;
         GXv_int10[0] = (short)(0) ;
         GXv_char11[0] = "" ;
         GXv_char12[0] = "" ;
         new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char3, GXv_char2, GXv_int4, GXv_int5, GXv_char1, GXv_char6, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_char11, GXv_char12) ;
         apcvcolorcliente.this.AV14ForNomcli = GXv_char6[0] ;
         AV12Control = " " ;
         if ( ( A213BarSit < 2 ) && ( GXutil.strcmp(A1234BarNomCli, " ") == 0 ) )
         {
            AV12Control = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " DisNomcli= ", "") + A1195DisNomCli ;
            AV15BarNomcli = A1195DisNomCli ;
            AV13Inc_obs = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( ".Ajusto campo BarNomcli f(DisNomcli) ", "") + AV15BarNomcli ;
            A1234BarNomCli = AV15BarNomcli ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV8UsurCod, AV9Station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         if ( ( A213BarSit > 2 ) && ( GXutil.strcmp(A1234BarNomCli, " ") == 0 ) )
         {
            AV12Control = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " DisNomcli= ", "") + A1195DisNomCli ;
            AV12Control += httpContext.getMessage( "ForNomcli= ", "") + AV14ForNomcli ;
            AV15BarNomcli = ((GXutil.strcmp(AV14ForNomcli, " ")!=0) ? AV14ForNomcli : A1195DisNomCli) ;
            AV16texto = ((GXutil.strcmp(AV14ForNomcli, " ")!=0) ? httpContext.getMessage( "ForNomcli", "") : httpContext.getMessage( "DisNomcli", "")) ;
            AV13Inc_obs = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( ".Ajusto campo BarNomcli  f(", "") + GXutil.trim( AV16texto) + ") " + AV15BarNomcli ;
            A1234BarNomCli = AV15BarNomcli ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV8UsurCod, AV9Station, AV13Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         if ( ( A213BarSit > 2 ) && ( GXutil.strcmp(A1234BarNomCli, A135BarColNom) == 0 ) && ( GXutil.strcmp(A135BarColNom, " ") != 0 ) && ( GXutil.strcmp(A1234BarNomCli, " ") != 0 ) )
         {
            AV12Control = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( " BarNomcli= ", "") + A1234BarNomCli ;
            AV12Control += httpContext.getMessage( "ForNomcli= ", "") + AV14ForNomcli ;
            AV13Inc_obs = httpContext.getMessage( "Barsit= ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( ".Ajusto campo BarNomcli  f(", "") + GXutil.trim( AV16texto) + ") " + AV15BarNomcli ;
         }
         if ( GXutil.strcmp(AV12Control, "") != 0 )
         {
            System.out.println( AV12Control );
         }
         /* Using cursor P060A3 */
         pr_default.execute(1, new Object[] {A1234BarNomCli, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pcvcolorcliente.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apcvcolorcliente");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      AV11EmprNom = "" ;
      scmdbuf = "" ;
      P060A2_A361DisCod = new int[1] ;
      P060A2_A213BarSit = new byte[1] ;
      P060A2_A396EmprCod = new String[] {""} ;
      P060A2_A252CliCod = new int[1] ;
      P060A2_n252CliCod = new boolean[] {false} ;
      P060A2_A212BarSer = new String[] {""} ;
      P060A2_A135BarColNom = new String[] {""} ;
      P060A2_A136BarColNum = new int[1] ;
      P060A2_A218BarTipCol = new byte[1] ;
      P060A2_A1234BarNomCli = new String[] {""} ;
      P060A2_A1195DisNomCli = new String[] {""} ;
      P060A2_A129BarCod = new int[1] ;
      P060A2_A132BarCodReo = new byte[1] ;
      P060A2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A1195DisNomCli = "" ;
      A130BarCodPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV14ForNomcli = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      AV12Control = "" ;
      AV15BarNomcli = "" ;
      AV13Inc_obs = "" ;
      AV20Pgmname = "" ;
      AV16texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apcvcolorcliente__default(),
         new Object[] {
             new Object[] {
            P060A2_A361DisCod, P060A2_A213BarSit, P060A2_A396EmprCod, P060A2_A252CliCod, P060A2_n252CliCod, P060A2_A212BarSer, P060A2_A135BarColNom, P060A2_A136BarColNum, P060A2_A218BarTipCol, P060A2_A1234BarNomCli,
            P060A2_A1195DisNomCli, P060A2_A129BarCod, P060A2_A132BarCodReo, P060A2_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "APCvColorCliente" ;
      /* GeneXus formulas. */
      AV20Pgmname = "APCvColorCliente" ;
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short GXv_int4[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String AV11EmprNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1195DisNomCli ;
   private String A130BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV14ForNomcli ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String AV15BarNomcli ;
   private String AV20Pgmname ;
   private String AV16texto ;
   private boolean n252CliCod ;
   private String AV12Control ;
   private String AV13Inc_obs ;
   private IDataStoreProvider pr_default ;
   private int[] P060A2_A361DisCod ;
   private byte[] P060A2_A213BarSit ;
   private String[] P060A2_A396EmprCod ;
   private int[] P060A2_A252CliCod ;
   private boolean[] P060A2_n252CliCod ;
   private String[] P060A2_A212BarSer ;
   private String[] P060A2_A135BarColNom ;
   private int[] P060A2_A136BarColNum ;
   private byte[] P060A2_A218BarTipCol ;
   private String[] P060A2_A1234BarNomCli ;
   private String[] P060A2_A1195DisNomCli ;
   private int[] P060A2_A129BarCod ;
   private byte[] P060A2_A132BarCodReo ;
   private String[] P060A2_A130BarCodPar ;
}

final  class apcvcolorcliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P060A2", "SELECT T1.DisCod, T1.BarSit, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNomCli, T2.DisNomCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ?) AND (T1.BarSit <= 9) ORDER BY T1.EmprCod, T1.BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P060A3", "UPDATE TXPBARCAD SET BarNomCli=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}


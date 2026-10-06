package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputi097 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputi097 pgm = new aputi097 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputi097( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputi097.class ), "" );
   }

   public aputi097( int remoteHandle ,
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
      AV11UsurCod = " " ;
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      aputi097.this.AV9EmprCod = GXv_char1[0] ;
      aputi097.this.AV10EmprNom = GXv_char2[0] ;
      aputi097.this.AV11UsurCod = GXv_char3[0] ;
      GXt_char4 = AV13Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      aputi097.this.GXt_char4 = GXv_char3[0] ;
      AV13Carpeta = GXt_char4 ;
      AV14NomInf = AV25Pgmname ;
      AV16File = ((GXutil.strcmp(AV13Carpeta, "")==0) ? httpContext.getMessage( "C:\\Informes_acatex\\Informes", "")+"\\"+GXutil.trim( AV14NomInf)+httpContext.getMessage( ".csv", "") : GXutil.trim( AV13Carpeta)+"\\"+GXutil.trim( AV14NomInf)+httpContext.getMessage( ".csv", "")) ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV16File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV17Stat = GXutil.deleteFile( AV16File) ;
      }
      GXt_int5 = AV20hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV16File, GXv_int6) ;
      aputi097.this.GXt_int5 = GXv_int6[0] ;
      AV20hnd = GXt_int5 ;
      AV15Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Auditoria Producto ", "") + AV8PrdNum ;
      System.out.println( AV15Control );
      GXt_int7 = AV17Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV20hnd, AV15Control, GXv_int8) ;
      aputi097.this.GXt_int7 = GXv_int8[0] ;
      AV17Stat = GXt_int7 ;
      AV15Control = httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Articulo", "") + ";" + httpContext.getMessage( "Dibujo Cli", "") + ";" + httpContext.getMessage( "Dibujo Int", "") + ";" + httpContext.getMessage( "Combinacion", "") + ";" + httpContext.getMessage( "Fondo", "") + ";" + httpContext.getMessage( "Cilindro/Molde", "") + ";" + httpContext.getMessage( "Linea", "") + ";" + httpContext.getMessage( "Unidad", "") + ";" + httpContext.getMessage( "Cantidad", "") ;
      GXt_int7 = AV17Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV20hnd, AV15Control, GXv_int8) ;
      aputi097.this.GXt_int7 = GXv_int8[0] ;
      AV17Stat = GXt_int7 ;
      AV22Nregistros = 0 ;
      /* Using cursor P057E2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P057E2_A719PrdNum[0] ;
         n719PrdNum = P057E2_n719PrdNum[0] ;
         A396EmprCod = P057E2_A396EmprCod[0] ;
         A2116PrdForCan = P057E2_A2116PrdForCan[0] ;
         n2116PrdForCan = P057E2_n2116PrdForCan[0] ;
         A2144UniEstCod = P057E2_A2144UniEstCod[0] ;
         n2144UniEstCod = P057E2_n2144UniEstCod[0] ;
         A2535ForPrdLin = P057E2_A2535ForPrdLin[0] ;
         A2098MolCod = P057E2_A2098MolCod[0] ;
         A2078ColFon = P057E2_A2078ColFon[0] ;
         A2074ColCom = P057E2_A2074ColCom[0] ;
         A1014DibInt = P057E2_A1014DibInt[0] ;
         A1013DibCli = P057E2_A1013DibCli[0] ;
         A2141SerEst = P057E2_A2141SerEst[0] ;
         A252CliCod = P057E2_A252CliCod[0] ;
         AV22Nregistros = (int)(AV22Nregistros+1) ;
         AV15Control = GXutil.str( A252CliCod, 6, 0) + ";" + A2141SerEst + ";" + A1013DibCli + ";" + GXutil.str( A1014DibInt, 8, 0) + ";" + A2074ColCom + ";" + A2078ColFon + ";" + GXutil.str( A2098MolCod, 2, 0) + ";" + GXutil.str( A2535ForPrdLin, 3, 0) + ";" + A2144UniEstCod + ";" + GXutil.str( A2116PrdForCan, 10, 3) ;
         GXt_int7 = AV17Stat ;
         GXv_int8[0] = GXt_int7 ;
         new app.core.fputs(remoteHandle, context).execute( AV20hnd, AV15Control, GXv_int8) ;
         aputi097.this.GXt_int7 = GXv_int8[0] ;
         AV17Stat = GXt_int7 ;
         AV15Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + "-> " + GXutil.str( A252CliCod, 6, 0) + ";" + A2141SerEst + ";" + A1013DibCli + ";" + GXutil.str( A1014DibInt, 8, 0) + ";" + A2074ColCom + ";" + A2078ColFon + ";" + GXutil.str( A2098MolCod, 2, 0) + ";" + GXutil.str( A2535ForPrdLin, 3, 0) + ";" + A2144UniEstCod + ";" + GXutil.str( A2116PrdForCan, 10, 3) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int7 = AV17Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV20hnd, GXv_int8) ;
      aputi097.this.GXt_int7 = GXv_int8[0] ;
      AV17Stat = GXt_int7 ;
      AV15Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin Auditoria ", "") + GXutil.str( AV22Nregistros, 6, 0) ;
      System.out.println( AV15Control );
      AV15Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( "Fichero Creado ", "") + AV16File ;
      System.out.println( AV15Control );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puti097.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11UsurCod = "" ;
      AV12Station = "" ;
      AV9EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV14NomInf = "" ;
      AV25Pgmname = "" ;
      AV16File = "" ;
      GXv_int6 = new long[1] ;
      AV15Control = "" ;
      AV8PrdNum = "" ;
      scmdbuf = "" ;
      P057E2_A719PrdNum = new String[] {""} ;
      P057E2_n719PrdNum = new boolean[] {false} ;
      P057E2_A396EmprCod = new String[] {""} ;
      P057E2_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057E2_n2116PrdForCan = new boolean[] {false} ;
      P057E2_A2144UniEstCod = new String[] {""} ;
      P057E2_n2144UniEstCod = new boolean[] {false} ;
      P057E2_A2535ForPrdLin = new short[1] ;
      P057E2_A2098MolCod = new byte[1] ;
      P057E2_A2078ColFon = new String[] {""} ;
      P057E2_A2074ColCom = new String[] {""} ;
      P057E2_A1014DibInt = new int[1] ;
      P057E2_A1013DibCli = new String[] {""} ;
      P057E2_A2141SerEst = new String[] {""} ;
      P057E2_A252CliCod = new int[1] ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputi097__default(),
         new Object[] {
             new Object[] {
            P057E2_A719PrdNum, P057E2_n719PrdNum, P057E2_A396EmprCod, P057E2_A2116PrdForCan, P057E2_n2116PrdForCan, P057E2_A2144UniEstCod, P057E2_n2144UniEstCod, P057E2_A2535ForPrdLin, P057E2_A2098MolCod, P057E2_A2078ColFon,
            P057E2_A2074ColCom, P057E2_A1014DibInt, P057E2_A1013DibCli, P057E2_A2141SerEst, P057E2_A252CliCod
            }
         }
      );
      AV25Pgmname = "APUTi097" ;
      /* GeneXus formulas. */
      AV25Pgmname = "APUTi097" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17Stat ;
   private byte A2098MolCod ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short A2535ForPrdLin ;
   private short Gx_err ;
   private int AV22Nregistros ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private long AV20hnd ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A2116PrdForCan ;
   private String AV11UsurCod ;
   private String AV12Station ;
   private String AV9EmprCod ;
   private String GXv_char1[] ;
   private String AV10EmprNom ;
   private String GXv_char2[] ;
   private String AV13Carpeta ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV14NomInf ;
   private String AV25Pgmname ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A2144UniEstCod ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private boolean Cond_result ;
   private boolean n719PrdNum ;
   private boolean n2116PrdForCan ;
   private boolean n2144UniEstCod ;
   private String AV16File ;
   private String AV15Control ;
   private IDataStoreProvider pr_default ;
   private String[] P057E2_A719PrdNum ;
   private boolean[] P057E2_n719PrdNum ;
   private String[] P057E2_A396EmprCod ;
   private java.math.BigDecimal[] P057E2_A2116PrdForCan ;
   private boolean[] P057E2_n2116PrdForCan ;
   private String[] P057E2_A2144UniEstCod ;
   private boolean[] P057E2_n2144UniEstCod ;
   private short[] P057E2_A2535ForPrdLin ;
   private byte[] P057E2_A2098MolCod ;
   private String[] P057E2_A2078ColFon ;
   private String[] P057E2_A2074ColCom ;
   private int[] P057E2_A1014DibInt ;
   private String[] P057E2_A1013DibCli ;
   private String[] P057E2_A2141SerEst ;
   private int[] P057E2_A252CliCod ;
}

final  class aputi097__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057E2", "SELECT PrdNum, EmprCod, PrdForCan, UniEstCod, ForPrdLin, MolCod, ColFon, ColCom, DibInt, DibCli, SerEst, CliCod FROM TXPRECPR2 WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 12);
               ((String[]) buf[10])[0] = rslt.getString(8, 12);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((int[]) buf[14])[0] = rslt.getInt(12);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}


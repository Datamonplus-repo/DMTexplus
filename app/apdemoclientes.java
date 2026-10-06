package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdemoclientes extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdemoclientes pgm = new apdemoclientes (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdemoclientes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdemoclientes.class ), "" );
   }

   public apdemoclientes( int remoteHandle ,
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
      /* Using cursor P05EO2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05EO2_A252CliCod[0] ;
         A396EmprCod = P05EO2_A396EmprCod[0] ;
         A279CliNom = P05EO2_A279CliNom[0] ;
         A260CliDom = P05EO2_A260CliDom[0] ;
         A295CliPob = P05EO2_A295CliPob[0] ;
         A278CliNif = P05EO2_A278CliNif[0] ;
         A303CliTel1 = P05EO2_A303CliTel1[0] ;
         A304CliTel2 = P05EO2_A304CliTel2[0] ;
         A3644CliNom1 = P05EO2_A3644CliNom1[0] ;
         A5649CliDom2 = P05EO2_A5649CliDom2[0] ;
         A293CliPer = P05EO2_A293CliPer[0] ;
         A2748CliAlias = P05EO2_A2748CliAlias[0] ;
         A274CliFax = P05EO2_A274CliFax[0] ;
         A3633CliEmail = P05EO2_A3633CliEmail[0] ;
         A10050Cliemf = P05EO2_A10050Cliemf[0] ;
         A279CliNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " Nombre Cliente I", "") ;
         A260CliDom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " Domcilio Cliente", "") ;
         A295CliPob = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " Poblacion Cliente", "") ;
         A278CliNif = "999999999" ;
         A303CliTel1 = "999 999 999" ;
         A304CliTel2 = "999 999 999" ;
         A3644CliNom1 = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " Nombre Cliente II ", "") ;
         A5649CliDom2 = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " Domcilio Cliente II", "") ;
         A293CliPer = httpContext.getMessage( "Persona Contacto", "") ;
         A2748CliAlias = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + httpContext.getMessage( " ALias", "") ;
         A274CliFax = "999 999 999" ;
         A3633CliEmail = httpContext.getMessage( "Mail@servidor.com", "") ;
         A10050Cliemf = httpContext.getMessage( "Mail@servidor.com", "") ;
         /* Using cursor P05EO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A265CliEnvDom = P05EO3_A265CliEnvDom[0] ;
            A268CliEnvPob = P05EO3_A268CliEnvPob[0] ;
            A264CliEnvCp = P05EO3_A264CliEnvCp[0] ;
            A266CliEnvLin = P05EO3_A266CliEnvLin[0] ;
            A265CliEnvDom = httpContext.getMessage( "Domicilio Envio 99999", "") ;
            A268CliEnvPob = httpContext.getMessage( "Poblacion Envio 99999", "") ;
            A264CliEnvCp = httpContext.getMessage( "Cp Envio", "") ;
            /* Using cursor P05EO4 */
            pr_default.execute(2, new Object[] {A265CliEnvDom, A268CliEnvPob, A264CliEnvCp, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P05EO5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A286CliPagDom = P05EO5_A286CliPagDom[0] ;
            A289CliPagPob = P05EO5_A289CliPagPob[0] ;
            A287CliPagLin = P05EO5_A287CliPagLin[0] ;
            A286CliPagDom = httpContext.getMessage( "Domicilio Pago 9999", "") ;
            A289CliPagPob = httpContext.getMessage( "Poblacion Pago 9999", "") ;
            /* Using cursor P05EO6 */
            pr_default.execute(4, new Object[] {A286CliPagDom, A289CliPagPob, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIPAG");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05EO7 */
         pr_default.execute(5, new Object[] {A279CliNom, A260CliDom, A295CliPob, A278CliNif, A303CliTel1, A304CliTel2, A3644CliNom1, A5649CliDom2, A293CliPer, A2748CliAlias, A274CliFax, A3633CliEmail, A10050Cliemf, A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05EO8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A795PrvNum = P05EO8_A795PrvNum[0] ;
         A794PrvNom = P05EO8_A794PrvNom[0] ;
         n794PrvNom = P05EO8_n794PrvNom[0] ;
         A786PrvDir = P05EO8_A786PrvDir[0] ;
         n786PrvDir = P05EO8_n786PrvDir[0] ;
         A799PrvPob = P05EO8_A799PrvPob[0] ;
         n799PrvPob = P05EO8_n799PrvPob[0] ;
         A793PrvNif = P05EO8_A793PrvNif[0] ;
         n793PrvNif = P05EO8_n793PrvNif[0] ;
         A803PrvTlf = P05EO8_A803PrvTlf[0] ;
         n803PrvTlf = P05EO8_n803PrvTlf[0] ;
         A801PrvRep = P05EO8_A801PrvRep[0] ;
         n801PrvRep = P05EO8_n801PrvRep[0] ;
         A396EmprCod = P05EO8_A396EmprCod[0] ;
         A794PrvNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + httpContext.getMessage( " Nombre Proveedor", "") ;
         n794PrvNom = false ;
         A786PrvDir = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + httpContext.getMessage( " Direccion Proveedor", "") ;
         n786PrvDir = false ;
         A799PrvPob = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + httpContext.getMessage( " Poblacion Proveedor", "") ;
         n799PrvPob = false ;
         A793PrvNif = "999999999" ;
         n793PrvNif = false ;
         A803PrvTlf = "999 999 999" ;
         n803PrvTlf = false ;
         A801PrvRep = httpContext.getMessage( "Nombre Representante", "") ;
         n801PrvRep = false ;
         /* Using cursor P05EO9 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n801PrvRep), A801PrvRep, A396EmprCod, Integer.valueOf(A795PrvNum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P05EO10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A653OpeNom = P05EO10_A653OpeNom[0] ;
         n653OpeNom = P05EO10_n653OpeNom[0] ;
         A652OpeCod = P05EO10_A652OpeCod[0] ;
         A396EmprCod = P05EO10_A396EmprCod[0] ;
         A653OpeNom = httpContext.getMessage( "Operario Nº ", "") + GXutil.str( A652OpeCod, 6, 0) ;
         n653OpeNom = false ;
         /* Using cursor P05EO11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom, A396EmprCod, Integer.valueOf(A652OpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
         pr_default.readNext(8);
      }
      pr_default.close(8);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdemoclientes.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdemoclientes");
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
      P05EO2_A252CliCod = new int[1] ;
      P05EO2_A396EmprCod = new String[] {""} ;
      P05EO2_A279CliNom = new String[] {""} ;
      P05EO2_A260CliDom = new String[] {""} ;
      P05EO2_A295CliPob = new String[] {""} ;
      P05EO2_A278CliNif = new String[] {""} ;
      P05EO2_A303CliTel1 = new String[] {""} ;
      P05EO2_A304CliTel2 = new String[] {""} ;
      P05EO2_A3644CliNom1 = new String[] {""} ;
      P05EO2_A5649CliDom2 = new String[] {""} ;
      P05EO2_A293CliPer = new String[] {""} ;
      P05EO2_A2748CliAlias = new String[] {""} ;
      P05EO2_A274CliFax = new String[] {""} ;
      P05EO2_A3633CliEmail = new String[] {""} ;
      P05EO2_A10050Cliemf = new String[] {""} ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A303CliTel1 = "" ;
      A304CliTel2 = "" ;
      A3644CliNom1 = "" ;
      A5649CliDom2 = "" ;
      A293CliPer = "" ;
      A2748CliAlias = "" ;
      A274CliFax = "" ;
      A3633CliEmail = "" ;
      A10050Cliemf = "" ;
      P05EO3_A396EmprCod = new String[] {""} ;
      P05EO3_A252CliCod = new int[1] ;
      P05EO3_A265CliEnvDom = new String[] {""} ;
      P05EO3_A268CliEnvPob = new String[] {""} ;
      P05EO3_A264CliEnvCp = new String[] {""} ;
      P05EO3_A266CliEnvLin = new byte[1] ;
      A265CliEnvDom = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      P05EO5_A396EmprCod = new String[] {""} ;
      P05EO5_A252CliCod = new int[1] ;
      P05EO5_A286CliPagDom = new String[] {""} ;
      P05EO5_A289CliPagPob = new String[] {""} ;
      P05EO5_A287CliPagLin = new byte[1] ;
      A286CliPagDom = "" ;
      A289CliPagPob = "" ;
      P05EO8_A795PrvNum = new int[1] ;
      P05EO8_A794PrvNom = new String[] {""} ;
      P05EO8_n794PrvNom = new boolean[] {false} ;
      P05EO8_A786PrvDir = new String[] {""} ;
      P05EO8_n786PrvDir = new boolean[] {false} ;
      P05EO8_A799PrvPob = new String[] {""} ;
      P05EO8_n799PrvPob = new boolean[] {false} ;
      P05EO8_A793PrvNif = new String[] {""} ;
      P05EO8_n793PrvNif = new boolean[] {false} ;
      P05EO8_A803PrvTlf = new String[] {""} ;
      P05EO8_n803PrvTlf = new boolean[] {false} ;
      P05EO8_A801PrvRep = new String[] {""} ;
      P05EO8_n801PrvRep = new boolean[] {false} ;
      P05EO8_A396EmprCod = new String[] {""} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A801PrvRep = "" ;
      P05EO10_A653OpeNom = new String[] {""} ;
      P05EO10_n653OpeNom = new boolean[] {false} ;
      P05EO10_A652OpeCod = new int[1] ;
      P05EO10_A396EmprCod = new String[] {""} ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdemoclientes__default(),
         new Object[] {
             new Object[] {
            P05EO2_A252CliCod, P05EO2_A396EmprCod, P05EO2_A279CliNom, P05EO2_A260CliDom, P05EO2_A295CliPob, P05EO2_A278CliNif, P05EO2_A303CliTel1, P05EO2_A304CliTel2, P05EO2_A3644CliNom1, P05EO2_A5649CliDom2,
            P05EO2_A293CliPer, P05EO2_A2748CliAlias, P05EO2_A274CliFax, P05EO2_A3633CliEmail, P05EO2_A10050Cliemf
            }
            , new Object[] {
            P05EO3_A396EmprCod, P05EO3_A252CliCod, P05EO3_A265CliEnvDom, P05EO3_A268CliEnvPob, P05EO3_A264CliEnvCp, P05EO3_A266CliEnvLin
            }
            , new Object[] {
            }
            , new Object[] {
            P05EO5_A396EmprCod, P05EO5_A252CliCod, P05EO5_A286CliPagDom, P05EO5_A289CliPagPob, P05EO5_A287CliPagLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05EO8_A795PrvNum, P05EO8_A794PrvNom, P05EO8_n794PrvNom, P05EO8_A786PrvDir, P05EO8_n786PrvDir, P05EO8_A799PrvPob, P05EO8_n799PrvPob, P05EO8_A793PrvNif, P05EO8_n793PrvNif, P05EO8_A803PrvTlf,
            P05EO8_n803PrvTlf, P05EO8_A801PrvRep, P05EO8_n801PrvRep, P05EO8_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05EO10_A653OpeNom, P05EO10_n653OpeNom, P05EO10_A652OpeCod, P05EO10_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A266CliEnvLin ;
   private byte A287CliPagLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A795PrvNum ;
   private int A652OpeCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A303CliTel1 ;
   private String A304CliTel2 ;
   private String A3644CliNom1 ;
   private String A5649CliDom2 ;
   private String A293CliPer ;
   private String A2748CliAlias ;
   private String A274CliFax ;
   private String A3633CliEmail ;
   private String A10050Cliemf ;
   private String A265CliEnvDom ;
   private String A268CliEnvPob ;
   private String A264CliEnvCp ;
   private String A286CliPagDom ;
   private String A289CliPagPob ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A801PrvRep ;
   private String A653OpeNom ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private boolean n803PrvTlf ;
   private boolean n801PrvRep ;
   private boolean n653OpeNom ;
   private IDataStoreProvider pr_default ;
   private int[] P05EO2_A252CliCod ;
   private String[] P05EO2_A396EmprCod ;
   private String[] P05EO2_A279CliNom ;
   private String[] P05EO2_A260CliDom ;
   private String[] P05EO2_A295CliPob ;
   private String[] P05EO2_A278CliNif ;
   private String[] P05EO2_A303CliTel1 ;
   private String[] P05EO2_A304CliTel2 ;
   private String[] P05EO2_A3644CliNom1 ;
   private String[] P05EO2_A5649CliDom2 ;
   private String[] P05EO2_A293CliPer ;
   private String[] P05EO2_A2748CliAlias ;
   private String[] P05EO2_A274CliFax ;
   private String[] P05EO2_A3633CliEmail ;
   private String[] P05EO2_A10050Cliemf ;
   private String[] P05EO3_A396EmprCod ;
   private int[] P05EO3_A252CliCod ;
   private String[] P05EO3_A265CliEnvDom ;
   private String[] P05EO3_A268CliEnvPob ;
   private String[] P05EO3_A264CliEnvCp ;
   private byte[] P05EO3_A266CliEnvLin ;
   private String[] P05EO5_A396EmprCod ;
   private int[] P05EO5_A252CliCod ;
   private String[] P05EO5_A286CliPagDom ;
   private String[] P05EO5_A289CliPagPob ;
   private byte[] P05EO5_A287CliPagLin ;
   private int[] P05EO8_A795PrvNum ;
   private String[] P05EO8_A794PrvNom ;
   private boolean[] P05EO8_n794PrvNom ;
   private String[] P05EO8_A786PrvDir ;
   private boolean[] P05EO8_n786PrvDir ;
   private String[] P05EO8_A799PrvPob ;
   private boolean[] P05EO8_n799PrvPob ;
   private String[] P05EO8_A793PrvNif ;
   private boolean[] P05EO8_n793PrvNif ;
   private String[] P05EO8_A803PrvTlf ;
   private boolean[] P05EO8_n803PrvTlf ;
   private String[] P05EO8_A801PrvRep ;
   private boolean[] P05EO8_n801PrvRep ;
   private String[] P05EO8_A396EmprCod ;
   private String[] P05EO10_A653OpeNom ;
   private boolean[] P05EO10_n653OpeNom ;
   private int[] P05EO10_A652OpeCod ;
   private String[] P05EO10_A396EmprCod ;
}

final  class apdemoclientes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05EO2", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliNif, CliTel1, CliTel2, CliNom1, CliDom2, CliPer, CliAlias, CliFax, CliEmail, Cliemf FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05EO3", "SELECT EmprCod, CliCod, CliEnvDom, CliEnvPob, CliEnvCp, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EO4", "UPDATE TXPCLIENV SET CliEnvDom=?, CliEnvPob=?, CliEnvCp=?  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENV")
         ,new ForEachCursor("P05EO5", "SELECT EmprCod, CliCod, CliPagDom, CliPagPob, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EO6", "UPDATE TXPCLIPAG SET CliPagDom=?, CliPagPob=?  WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIPAG")
         ,new UpdateCursor("P05EO7", "UPDATE TXPCLIENT SET CliNom=?, CliDom=?, CliPob=?, CliNif=?, CliTel1=?, CliTel2=?, CliNom1=?, CliDom2=?, CliPer=?, CliAlias=?, CliFax=?, CliEmail=?, Cliemf=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P05EO8", "SELECT PrvNum, PrvNom, PrvDir, PrvPob, PrvNif, PrvTlf, PrvRep, EmprCod FROM TXPPRVGEN ORDER BY EmprCod, PrvNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EO9", "UPDATE TXPPRVGEN SET PrvNom=?, PrvDir=?, PrvPob=?, PrvNif=?, PrvTlf=?, PrvRep=?  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVGEN")
         ,new ForEachCursor("P05EO10", "SELECT OpeNom, OpeCod, EmprCod FROM TXPOPERAR ORDER BY EmprCod, OpeCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EO11", "UPDATE TXPOPERAR SET OpeNom=?  WHERE EmprCod = ? AND OpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOPERAR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 15);
               ((String[]) buf[7])[0] = rslt.getString(8, 15);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 34);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 18);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 34);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 34);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 34);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 15);
               stmt.setString(6, (String)parms[5], 15);
               stmt.setString(7, (String)parms[6], 30);
               stmt.setString(8, (String)parms[7], 34);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 40);
               stmt.setString(13, (String)parms[12], 40);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 18);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}


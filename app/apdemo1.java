package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdemo1 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdemo1 pgm = new apdemo1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdemo1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdemo1.class ), "" );
   }

   public apdemo1( int remoteHandle ,
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
      /* Using cursor P01512 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01512_A252CliCod[0] ;
         A396EmprCod = P01512_A396EmprCod[0] ;
         A279CliNom = P01512_A279CliNom[0] ;
         A260CliDom = P01512_A260CliDom[0] ;
         A295CliPob = P01512_A295CliPob[0] ;
         A278CliNif = P01512_A278CliNif[0] ;
         A303CliTel1 = P01512_A303CliTel1[0] ;
         A304CliTel2 = P01512_A304CliTel2[0] ;
         A3644CliNom1 = P01512_A3644CliNom1[0] ;
         A5649CliDom2 = P01512_A5649CliDom2[0] ;
         A293CliPer = P01512_A293CliPer[0] ;
         A2748CliAlias = P01512_A2748CliAlias[0] ;
         A274CliFax = P01512_A274CliFax[0] ;
         A3633CliEmail = P01512_A3633CliEmail[0] ;
         A10050Cliemf = P01512_A10050Cliemf[0] ;
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
         /* Using cursor P01513 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A265CliEnvDom = P01513_A265CliEnvDom[0] ;
            A268CliEnvPob = P01513_A268CliEnvPob[0] ;
            A264CliEnvCp = P01513_A264CliEnvCp[0] ;
            A266CliEnvLin = P01513_A266CliEnvLin[0] ;
            A265CliEnvDom = httpContext.getMessage( "Domicilio Envio 99999", "") ;
            A268CliEnvPob = httpContext.getMessage( "Poblacion Envio 99999", "") ;
            A264CliEnvCp = httpContext.getMessage( "Cp Envio", "") ;
            /* Using cursor P01514 */
            pr_default.execute(2, new Object[] {A265CliEnvDom, A268CliEnvPob, A264CliEnvCp, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P01515 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A286CliPagDom = P01515_A286CliPagDom[0] ;
            A289CliPagPob = P01515_A289CliPagPob[0] ;
            A287CliPagLin = P01515_A287CliPagLin[0] ;
            A286CliPagDom = httpContext.getMessage( "Domicilio Pago 9999", "") ;
            A289CliPagPob = httpContext.getMessage( "Poblacion Pago 9999", "") ;
            /* Using cursor P01516 */
            pr_default.execute(4, new Object[] {A286CliPagDom, A289CliPagPob, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIPAG");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P01517 */
         pr_default.execute(5, new Object[] {A279CliNom, A260CliDom, A295CliPob, A278CliNif, A303CliTel1, A304CliTel2, A3644CliNom1, A5649CliDom2, A293CliPer, A2748CliAlias, A274CliFax, A3633CliEmail, A10050Cliemf, A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01518 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A795PrvNum = P01518_A795PrvNum[0] ;
         A794PrvNom = P01518_A794PrvNom[0] ;
         n794PrvNom = P01518_n794PrvNom[0] ;
         A786PrvDir = P01518_A786PrvDir[0] ;
         n786PrvDir = P01518_n786PrvDir[0] ;
         A799PrvPob = P01518_A799PrvPob[0] ;
         n799PrvPob = P01518_n799PrvPob[0] ;
         A793PrvNif = P01518_A793PrvNif[0] ;
         n793PrvNif = P01518_n793PrvNif[0] ;
         A803PrvTlf = P01518_A803PrvTlf[0] ;
         n803PrvTlf = P01518_n803PrvTlf[0] ;
         A801PrvRep = P01518_A801PrvRep[0] ;
         n801PrvRep = P01518_n801PrvRep[0] ;
         A396EmprCod = P01518_A396EmprCod[0] ;
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
         /* Using cursor P01519 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom, Boolean.valueOf(n786PrvDir), A786PrvDir, Boolean.valueOf(n799PrvPob), A799PrvPob, Boolean.valueOf(n793PrvNif), A793PrvNif, Boolean.valueOf(n803PrvTlf), A803PrvTlf, Boolean.valueOf(n801PrvRep), A801PrvRep, A396EmprCod, Integer.valueOf(A795PrvNum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P015110 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A653OpeNom = P015110_A653OpeNom[0] ;
         n653OpeNom = P015110_n653OpeNom[0] ;
         A652OpeCod = P015110_A652OpeCod[0] ;
         A396EmprCod = P015110_A396EmprCod[0] ;
         A653OpeNom = httpContext.getMessage( "Operario Nº ", "") + GXutil.str( A652OpeCod, 6, 0) ;
         n653OpeNom = false ;
         /* Using cursor P015111 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom, A396EmprCod, Integer.valueOf(A652OpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( 0 == 1 )
      {
         /* Using cursor P015112 */
         pr_default.execute(10);
         while ( (pr_default.getStatus(10) != 101) )
         {
            A606MaqDsc = P015112_A606MaqDsc[0] ;
            n606MaqDsc = P015112_n606MaqDsc[0] ;
            A8423MaqPasw = P015112_A8423MaqPasw[0] ;
            n8423MaqPasw = P015112_n8423MaqPasw[0] ;
            A8657MaqLoc = P015112_A8657MaqLoc[0] ;
            n8657MaqLoc = P015112_n8657MaqLoc[0] ;
            A396EmprCod = P015112_A396EmprCod[0] ;
            A602MaqCod = P015112_A602MaqCod[0] ;
            if ( GXutil.strcmp(GXutil.substring( A606MaqDsc, 1, 6), httpContext.getMessage( "MQ L-T", "")) == 0 )
            {
               A606MaqDsc = A8657MaqLoc + A8423MaqPasw ;
               n606MaqDsc = false ;
            }
            /* Using cursor P015113 */
            pr_default.execute(11, new Object[] {Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod, A602MaqCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
            pr_default.readNext(10);
         }
         pr_default.close(10);
      }
      /* Using cursor P015114 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A719PrdNum = P015114_A719PrdNum[0] ;
         n719PrdNum = P015114_n719PrdNum[0] ;
         A718PrdNom = P015114_A718PrdNom[0] ;
         A396EmprCod = P015114_A396EmprCod[0] ;
         AV12LenVar = GXutil.len( A719PrdNum) ;
         if ( ( AV12LenVar >= 5 ) && ( AV12LenVar <= 6 ) )
         {
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               A718PrdNom = httpContext.getMessage( "Colorante ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 )
            {
               A718PrdNom = httpContext.getMessage( "Auxiliar ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") == 0 )
            {
               A718PrdNom = httpContext.getMessage( "Sodico ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A718PrdNom = httpContext.getMessage( "Comp ", "") + A719PrdNum ;
            }
         }
         /* Using cursor P015115 */
         pr_default.execute(13, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(12);
      }
      pr_default.close(12);
      /* Using cursor P015116 */
      pr_default.execute(14);
      while ( (pr_default.getStatus(14) != 101) )
      {
         A763ProForCla = P015116_A763ProForCla[0] ;
         A770ProForPrd = P015116_A770ProForPrd[0] ;
         A765ProForDes = P015116_A765ProForDes[0] ;
         A396EmprCod = P015116_A396EmprCod[0] ;
         A764ProForCod = P015116_A764ProForCod[0] ;
         A767ProForLin = P015116_A767ProForLin[0] ;
         if ( GXutil.strcmp(GXutil.substring( A763ProForCla, 1, 2), httpContext.getMessage( "AC", "")) == 0 )
         {
         }
         else
         {
            AV12LenVar = GXutil.len( A770ProForPrd) ;
            if ( ( AV12LenVar >= 5 ) && ( AV12LenVar <= 6 ) )
            {
               if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
               {
                  A765ProForDes = httpContext.getMessage( "Colorante ", "") + A770ProForPrd ;
               }
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "8") == 0 )
               {
                  A765ProForDes = httpContext.getMessage( "Auxiliar ", "") + A770ProForPrd ;
               }
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "9") == 0 )
               {
                  A765ProForDes = httpContext.getMessage( "Sodico ", "") + A770ProForPrd ;
               }
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
               {
                  A765ProForDes = httpContext.getMessage( "Comp ", "") + A770ProForPrd ;
               }
            }
         }
         /* Using cursor P015117 */
         pr_default.execute(15, new Object[] {A765ProForDes, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         pr_default.readNext(14);
      }
      pr_default.close(14);
      /* Using cursor P015118 */
      pr_default.execute(16);
      while ( (pr_default.getStatus(16) != 101) )
      {
         A719PrdNum = P015118_A719PrdNum[0] ;
         n719PrdNum = P015118_n719PrdNum[0] ;
         A875RecPrdDsc = P015118_A875RecPrdDsc[0] ;
         A396EmprCod = P015118_A396EmprCod[0] ;
         A129BarCod = P015118_A129BarCod[0] ;
         A132BarCodReo = P015118_A132BarCodReo[0] ;
         A130BarCodPar = P015118_A130BarCodPar[0] ;
         A2804RecLinMaq = P015118_A2804RecLinMaq[0] ;
         A1273RecLinPro = P015118_A1273RecLinPro[0] ;
         A811RecLin = P015118_A811RecLin[0] ;
         AV12LenVar = GXutil.len( A719PrdNum) ;
         if ( ( AV12LenVar >= 5 ) && ( AV12LenVar <= 6 ) )
         {
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               A875RecPrdDsc = httpContext.getMessage( "Colorante ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 )
            {
               A875RecPrdDsc = httpContext.getMessage( "Auxiliar ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") == 0 )
            {
               A875RecPrdDsc = httpContext.getMessage( "Sodico ", "") + A719PrdNum ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A875RecPrdDsc = httpContext.getMessage( "Comp ", "") + A719PrdNum ;
            }
         }
         /* Using cursor P015119 */
         pr_default.execute(17, new Object[] {A875RecPrdDsc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         pr_default.readNext(16);
      }
      pr_default.close(16);
      Application.commitDataStores(context, remoteHandle, pr_default, "apdemo1");
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Comienza Historico Recetas...", ""));
      /* Using cursor P015120 */
      pr_default.execute(18);
      while ( (pr_default.getStatus(18) != 101) )
      {
         A719PrdNum = P015120_A719PrdNum[0] ;
         n719PrdNum = P015120_n719PrdNum[0] ;
         A4559HrePrdDsc = P015120_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P015120_n4559HrePrdDsc[0] ;
         A396EmprCod = P015120_A396EmprCod[0] ;
         A4492HreBarCod = P015120_A4492HreBarCod[0] ;
         A4493HreBarReo = P015120_A4493HreBarReo[0] ;
         A4494HreBarPar = P015120_A4494HreBarPar[0] ;
         A4495HreNumCie = P015120_A4495HreNumCie[0] ;
         A4545HreLinMaq = P015120_A4545HreLinMaq[0] ;
         A4550HreLinPro = P015120_A4550HreLinPro[0] ;
         A4557HreRecLin = P015120_A4557HreRecLin[0] ;
         AV12LenVar = GXutil.len( A719PrdNum) ;
         if ( ( AV12LenVar >= 5 ) && ( AV12LenVar <= 6 ) )
         {
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               A4559HrePrdDsc = httpContext.getMessage( "Colorante ", "") + A719PrdNum ;
               n4559HrePrdDsc = false ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 )
            {
               A4559HrePrdDsc = httpContext.getMessage( "Auxiliar ", "") + A719PrdNum ;
               n4559HrePrdDsc = false ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") == 0 )
            {
               A4559HrePrdDsc = httpContext.getMessage( "Sodico ", "") + A719PrdNum ;
               n4559HrePrdDsc = false ;
            }
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A4559HrePrdDsc = httpContext.getMessage( "Comp ", "") + A719PrdNum ;
               n4559HrePrdDsc = false ;
            }
            Gx_msg = httpContext.getMessage( "Procesando... ", "") + A719PrdNum ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P015121 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
         pr_default.readNext(18);
      }
      pr_default.close(18);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdemo1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdemo1");
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
      P01512_A252CliCod = new int[1] ;
      P01512_A396EmprCod = new String[] {""} ;
      P01512_A279CliNom = new String[] {""} ;
      P01512_A260CliDom = new String[] {""} ;
      P01512_A295CliPob = new String[] {""} ;
      P01512_A278CliNif = new String[] {""} ;
      P01512_A303CliTel1 = new String[] {""} ;
      P01512_A304CliTel2 = new String[] {""} ;
      P01512_A3644CliNom1 = new String[] {""} ;
      P01512_A5649CliDom2 = new String[] {""} ;
      P01512_A293CliPer = new String[] {""} ;
      P01512_A2748CliAlias = new String[] {""} ;
      P01512_A274CliFax = new String[] {""} ;
      P01512_A3633CliEmail = new String[] {""} ;
      P01512_A10050Cliemf = new String[] {""} ;
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
      P01513_A396EmprCod = new String[] {""} ;
      P01513_A252CliCod = new int[1] ;
      P01513_A265CliEnvDom = new String[] {""} ;
      P01513_A268CliEnvPob = new String[] {""} ;
      P01513_A264CliEnvCp = new String[] {""} ;
      P01513_A266CliEnvLin = new byte[1] ;
      A265CliEnvDom = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      P01515_A396EmprCod = new String[] {""} ;
      P01515_A252CliCod = new int[1] ;
      P01515_A286CliPagDom = new String[] {""} ;
      P01515_A289CliPagPob = new String[] {""} ;
      P01515_A287CliPagLin = new byte[1] ;
      A286CliPagDom = "" ;
      A289CliPagPob = "" ;
      P01518_A795PrvNum = new int[1] ;
      P01518_A794PrvNom = new String[] {""} ;
      P01518_n794PrvNom = new boolean[] {false} ;
      P01518_A786PrvDir = new String[] {""} ;
      P01518_n786PrvDir = new boolean[] {false} ;
      P01518_A799PrvPob = new String[] {""} ;
      P01518_n799PrvPob = new boolean[] {false} ;
      P01518_A793PrvNif = new String[] {""} ;
      P01518_n793PrvNif = new boolean[] {false} ;
      P01518_A803PrvTlf = new String[] {""} ;
      P01518_n803PrvTlf = new boolean[] {false} ;
      P01518_A801PrvRep = new String[] {""} ;
      P01518_n801PrvRep = new boolean[] {false} ;
      P01518_A396EmprCod = new String[] {""} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A801PrvRep = "" ;
      P015110_A653OpeNom = new String[] {""} ;
      P015110_n653OpeNom = new boolean[] {false} ;
      P015110_A652OpeCod = new int[1] ;
      P015110_A396EmprCod = new String[] {""} ;
      A653OpeNom = "" ;
      P015112_A606MaqDsc = new String[] {""} ;
      P015112_n606MaqDsc = new boolean[] {false} ;
      P015112_A8423MaqPasw = new String[] {""} ;
      P015112_n8423MaqPasw = new boolean[] {false} ;
      P015112_A8657MaqLoc = new String[] {""} ;
      P015112_n8657MaqLoc = new boolean[] {false} ;
      P015112_A396EmprCod = new String[] {""} ;
      P015112_A602MaqCod = new String[] {""} ;
      A606MaqDsc = "" ;
      A8423MaqPasw = "" ;
      A8657MaqLoc = "" ;
      A602MaqCod = "" ;
      P015114_A719PrdNum = new String[] {""} ;
      P015114_n719PrdNum = new boolean[] {false} ;
      P015114_A718PrdNom = new String[] {""} ;
      P015114_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      P015116_A763ProForCla = new String[] {""} ;
      P015116_A770ProForPrd = new String[] {""} ;
      P015116_A765ProForDes = new String[] {""} ;
      P015116_A396EmprCod = new String[] {""} ;
      P015116_A764ProForCod = new String[] {""} ;
      P015116_A767ProForLin = new short[1] ;
      A763ProForCla = "" ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A764ProForCod = "" ;
      P015118_A719PrdNum = new String[] {""} ;
      P015118_n719PrdNum = new boolean[] {false} ;
      P015118_A875RecPrdDsc = new String[] {""} ;
      P015118_A396EmprCod = new String[] {""} ;
      P015118_A129BarCod = new int[1] ;
      P015118_A132BarCodReo = new byte[1] ;
      P015118_A130BarCodPar = new String[] {""} ;
      P015118_A2804RecLinMaq = new short[1] ;
      P015118_A1273RecLinPro = new byte[1] ;
      P015118_A811RecLin = new short[1] ;
      A875RecPrdDsc = "" ;
      A130BarCodPar = "" ;
      P015120_A719PrdNum = new String[] {""} ;
      P015120_n719PrdNum = new boolean[] {false} ;
      P015120_A4559HrePrdDsc = new String[] {""} ;
      P015120_n4559HrePrdDsc = new boolean[] {false} ;
      P015120_A396EmprCod = new String[] {""} ;
      P015120_A4492HreBarCod = new int[1] ;
      P015120_A4493HreBarReo = new byte[1] ;
      P015120_A4494HreBarPar = new String[] {""} ;
      P015120_A4495HreNumCie = new byte[1] ;
      P015120_A4545HreLinMaq = new short[1] ;
      P015120_A4550HreLinPro = new byte[1] ;
      P015120_A4557HreRecLin = new short[1] ;
      A4559HrePrdDsc = "" ;
      A4494HreBarPar = "" ;
      Gx_msg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apdemo1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apdemo1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apdemo1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdemo1__default(),
         new Object[] {
             new Object[] {
            P01512_A252CliCod, P01512_A396EmprCod, P01512_A279CliNom, P01512_A260CliDom, P01512_A295CliPob, P01512_A278CliNif, P01512_A303CliTel1, P01512_A304CliTel2, P01512_A3644CliNom1, P01512_A5649CliDom2,
            P01512_A293CliPer, P01512_A2748CliAlias, P01512_A274CliFax, P01512_A3633CliEmail, P01512_A10050Cliemf
            }
            , new Object[] {
            P01513_A396EmprCod, P01513_A252CliCod, P01513_A265CliEnvDom, P01513_A268CliEnvPob, P01513_A264CliEnvCp, P01513_A266CliEnvLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01515_A396EmprCod, P01515_A252CliCod, P01515_A286CliPagDom, P01515_A289CliPagPob, P01515_A287CliPagLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01518_A795PrvNum, P01518_A794PrvNom, P01518_n794PrvNom, P01518_A786PrvDir, P01518_n786PrvDir, P01518_A799PrvPob, P01518_n799PrvPob, P01518_A793PrvNif, P01518_n793PrvNif, P01518_A803PrvTlf,
            P01518_n803PrvTlf, P01518_A801PrvRep, P01518_n801PrvRep, P01518_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P015110_A653OpeNom, P015110_n653OpeNom, P015110_A652OpeCod, P015110_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P015112_A606MaqDsc, P015112_n606MaqDsc, P015112_A8423MaqPasw, P015112_n8423MaqPasw, P015112_A8657MaqLoc, P015112_n8657MaqLoc, P015112_A396EmprCod, P015112_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P015114_A719PrdNum, P015114_A718PrdNom, P015114_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P015116_A763ProForCla, P015116_A770ProForPrd, P015116_A765ProForDes, P015116_A396EmprCod, P015116_A764ProForCod, P015116_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            P015118_A719PrdNum, P015118_n719PrdNum, P015118_A875RecPrdDsc, P015118_A396EmprCod, P015118_A129BarCod, P015118_A132BarCodReo, P015118_A130BarCodPar, P015118_A2804RecLinMaq, P015118_A1273RecLinPro, P015118_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            P015120_A719PrdNum, P015120_n719PrdNum, P015120_A4559HrePrdDsc, P015120_n4559HrePrdDsc, P015120_A396EmprCod, P015120_A4492HreBarCod, P015120_A4493HreBarReo, P015120_A4494HreBarPar, P015120_A4495HreNumCie, P015120_A4545HreLinMaq,
            P015120_A4550HreLinPro, P015120_A4557HreRecLin
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
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A767ProForLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A795PrvNum ;
   private int A652OpeCod ;
   private int AV12LenVar ;
   private int A129BarCod ;
   private int A4492HreBarCod ;
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
   private String A606MaqDsc ;
   private String A8423MaqPasw ;
   private String A8657MaqLoc ;
   private String A602MaqCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A763ProForCla ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A764ProForCod ;
   private String A875RecPrdDsc ;
   private String A130BarCodPar ;
   private String A4559HrePrdDsc ;
   private String A4494HreBarPar ;
   private String Gx_msg ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private boolean n803PrvTlf ;
   private boolean n801PrvRep ;
   private boolean n653OpeNom ;
   private boolean n606MaqDsc ;
   private boolean n8423MaqPasw ;
   private boolean n8657MaqLoc ;
   private boolean n719PrdNum ;
   private boolean n4559HrePrdDsc ;
   private IDataStoreProvider pr_default ;
   private int[] P01512_A252CliCod ;
   private String[] P01512_A396EmprCod ;
   private String[] P01512_A279CliNom ;
   private String[] P01512_A260CliDom ;
   private String[] P01512_A295CliPob ;
   private String[] P01512_A278CliNif ;
   private String[] P01512_A303CliTel1 ;
   private String[] P01512_A304CliTel2 ;
   private String[] P01512_A3644CliNom1 ;
   private String[] P01512_A5649CliDom2 ;
   private String[] P01512_A293CliPer ;
   private String[] P01512_A2748CliAlias ;
   private String[] P01512_A274CliFax ;
   private String[] P01512_A3633CliEmail ;
   private String[] P01512_A10050Cliemf ;
   private String[] P01513_A396EmprCod ;
   private int[] P01513_A252CliCod ;
   private String[] P01513_A265CliEnvDom ;
   private String[] P01513_A268CliEnvPob ;
   private String[] P01513_A264CliEnvCp ;
   private byte[] P01513_A266CliEnvLin ;
   private String[] P01515_A396EmprCod ;
   private int[] P01515_A252CliCod ;
   private String[] P01515_A286CliPagDom ;
   private String[] P01515_A289CliPagPob ;
   private byte[] P01515_A287CliPagLin ;
   private int[] P01518_A795PrvNum ;
   private String[] P01518_A794PrvNom ;
   private boolean[] P01518_n794PrvNom ;
   private String[] P01518_A786PrvDir ;
   private boolean[] P01518_n786PrvDir ;
   private String[] P01518_A799PrvPob ;
   private boolean[] P01518_n799PrvPob ;
   private String[] P01518_A793PrvNif ;
   private boolean[] P01518_n793PrvNif ;
   private String[] P01518_A803PrvTlf ;
   private boolean[] P01518_n803PrvTlf ;
   private String[] P01518_A801PrvRep ;
   private boolean[] P01518_n801PrvRep ;
   private String[] P01518_A396EmprCod ;
   private String[] P015110_A653OpeNom ;
   private boolean[] P015110_n653OpeNom ;
   private int[] P015110_A652OpeCod ;
   private String[] P015110_A396EmprCod ;
   private String[] P015112_A606MaqDsc ;
   private boolean[] P015112_n606MaqDsc ;
   private String[] P015112_A8423MaqPasw ;
   private boolean[] P015112_n8423MaqPasw ;
   private String[] P015112_A8657MaqLoc ;
   private boolean[] P015112_n8657MaqLoc ;
   private String[] P015112_A396EmprCod ;
   private String[] P015112_A602MaqCod ;
   private String[] P015114_A719PrdNum ;
   private boolean[] P015114_n719PrdNum ;
   private String[] P015114_A718PrdNom ;
   private String[] P015114_A396EmprCod ;
   private String[] P015116_A763ProForCla ;
   private String[] P015116_A770ProForPrd ;
   private String[] P015116_A765ProForDes ;
   private String[] P015116_A396EmprCod ;
   private String[] P015116_A764ProForCod ;
   private short[] P015116_A767ProForLin ;
   private String[] P015118_A719PrdNum ;
   private boolean[] P015118_n719PrdNum ;
   private String[] P015118_A875RecPrdDsc ;
   private String[] P015118_A396EmprCod ;
   private int[] P015118_A129BarCod ;
   private byte[] P015118_A132BarCodReo ;
   private String[] P015118_A130BarCodPar ;
   private short[] P015118_A2804RecLinMaq ;
   private byte[] P015118_A1273RecLinPro ;
   private short[] P015118_A811RecLin ;
   private String[] P015120_A719PrdNum ;
   private boolean[] P015120_n719PrdNum ;
   private String[] P015120_A4559HrePrdDsc ;
   private boolean[] P015120_n4559HrePrdDsc ;
   private String[] P015120_A396EmprCod ;
   private int[] P015120_A4492HreBarCod ;
   private byte[] P015120_A4493HreBarReo ;
   private String[] P015120_A4494HreBarPar ;
   private byte[] P015120_A4495HreNumCie ;
   private short[] P015120_A4545HreLinMaq ;
   private byte[] P015120_A4550HreLinPro ;
   private short[] P015120_A4557HreRecLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apdemo1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apdemo1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apdemo1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apdemo1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01512", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliNif, CliTel1, CliTel2, CliNom1, CliDom2, CliPer, CliAlias, CliFax, CliEmail, Cliemf FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01513", "SELECT EmprCod, CliCod, CliEnvDom, CliEnvPob, CliEnvCp, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01514", "UPDATE TXPCLIENV SET CliEnvDom=?, CliEnvPob=?, CliEnvCp=?  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENV")
         ,new ForEachCursor("P01515", "SELECT EmprCod, CliCod, CliPagDom, CliPagPob, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01516", "UPDATE TXPCLIPAG SET CliPagDom=?, CliPagPob=?  WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIPAG")
         ,new UpdateCursor("P01517", "UPDATE TXPCLIENT SET CliNom=?, CliDom=?, CliPob=?, CliNif=?, CliTel1=?, CliTel2=?, CliNom1=?, CliDom2=?, CliPer=?, CliAlias=?, CliFax=?, CliEmail=?, Cliemf=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P01518", "SELECT PrvNum, PrvNom, PrvDir, PrvPob, PrvNif, PrvTlf, PrvRep, EmprCod FROM TXPPRVGEN ORDER BY EmprCod, PrvNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01519", "UPDATE TXPPRVGEN SET PrvNom=?, PrvDir=?, PrvPob=?, PrvNif=?, PrvTlf=?, PrvRep=?  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVGEN")
         ,new ForEachCursor("P015110", "SELECT OpeNom, OpeCod, EmprCod FROM TXPOPERAR ORDER BY EmprCod, OpeCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015111", "UPDATE TXPOPERAR SET OpeNom=?  WHERE EmprCod = ? AND OpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOPERAR")
         ,new ForEachCursor("P015112", "SELECT MaqDsc, MaqPasw, MaqLoc, EmprCod, MaqCod FROM TXPMAQUIN ORDER BY EmprCod, MaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015113", "UPDATE TXPMAQUIN SET MaqDsc=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
         ,new ForEachCursor("P015114", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015115", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P015116", "SELECT ProForCla, ProForPrd, ProForDes, EmprCod, ProForCod, ProForLin FROM TXPLPROFO ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015117", "UPDATE TXPLPROFO SET ProForDes=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new ForEachCursor("P015118", "SELECT PrdNum, RecPrdDsc, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015119", "UPDATE TXPLRECET SET RecPrdDsc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new ForEachCursor("P015120", "SELECT PrdNum, HrePrdDsc, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015121", "UPDATE TXPHISLRE SET HrePrdDsc=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
      }
   }

}


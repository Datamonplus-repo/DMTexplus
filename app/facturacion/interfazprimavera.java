package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class interfazprimavera extends GXProcedure
{
   public interfazprimavera( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( interfazprimavera.class ), "" );
   }

   public interfazprimavera( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            int aP2 ,
                            java.util.Date aP3 ,
                            java.util.Date aP4 ,
                            int aP5 ,
                            int aP6 ,
                            String aP7 ,
                            String[] aP8 ,
                            String[] aP9 )
   {
      interfazprimavera.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        int aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 )
   {
      interfazprimavera.this.A396EmprCod = aP0;
      interfazprimavera.this.AV19Clicodfrom = aP1;
      interfazprimavera.this.AV18Clicodto = aP2;
      interfazprimavera.this.AV17Facfchfrom = aP3;
      interfazprimavera.this.AV16Facfchto = aP4;
      interfazprimavera.this.AV15Faccodfrom = aP5;
      interfazprimavera.this.AV14Faccodto = aP6;
      interfazprimavera.this.AV13DirOri = aP7;
      interfazprimavera.this.aP8 = aP8;
      interfazprimavera.this.aP9 = aP9;
      interfazprimavera.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40path = GXutil.trim( AV13DirOri) ;
      AV38len = (short)(GXutil.len( GXutil.trim( AV40path))) ;
      if ( GXutil.strcmp(GXutil.substring( AV40path, AV38len, 1), "\\") != 0 )
      {
         AV40path += "\\" ;
      }
      AV54Var_File = "" ;
      AV48messages.clear();
      AV46Json_Col_Inc_obs = "" ;
      AV55registrosprocesados = (short)(0) ;
      AV39ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV39ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV39ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV39ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV39ProgressIndicator.show();
      AV41CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV15Faccodfrom) ,
                                           Integer.valueOf(AV14Faccodto) ,
                                           AV17Facfchfrom ,
                                           AV16Facfchto ,
                                           Integer.valueOf(AV19Clicodfrom) ,
                                           Integer.valueOf(AV18Clicodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09ZI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Faccodfrom), Integer.valueOf(AV14Faccodto), AV17Facfchfrom, AV16Facfchto, Integer.valueOf(AV19Clicodfrom), Integer.valueOf(AV18Clicodto)});
      cV41CantidadRegistrosAProcesar = P09ZI2_AV41CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV41CantidadRegistrosAProcesar = (short)(AV41CantidadRegistrosAProcesar+cV41CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV41CantidadRegistrosAProcesar == 0 )
      {
         AV41CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV49message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV49message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV41CantidadRegistrosAProcesar, 4, 0) );
      AV49message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Registros a procesar", "") );
      AV48messages.add(AV49message, 0);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV42CantidadRegistrosProcesados = (short)(0) ;
      AV49message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV49message.setgxTv_SdtMessages_Message_Id( "" );
      AV49message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Vamos a leer las facturas a actualizar", "") );
      AV48messages.add(AV49message, 0);
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV15Faccodfrom) ,
                                           Integer.valueOf(AV14Faccodto) ,
                                           AV17Facfchfrom ,
                                           AV16Facfchto ,
                                           Integer.valueOf(AV19Clicodfrom) ,
                                           Integer.valueOf(AV18Clicodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A965FacCob ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P09ZI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Faccodfrom), Integer.valueOf(AV14Faccodto), AV17Facfchfrom, AV16Facfchto, Integer.valueOf(AV19Clicodfrom), Integer.valueOf(AV18Clicodto)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A965FacCob = P09ZI3_A965FacCob[0] ;
         A252CliCod = P09ZI3_A252CliCod[0] ;
         A436FacFch = P09ZI3_A436FacFch[0] ;
         A430FacCod = P09ZI3_A430FacCod[0] ;
         A437FacFpg = P09ZI3_A437FacFpg[0] ;
         A443FacIVAPor = P09ZI3_A443FacIVAPor[0] ;
         A279CliNom = P09ZI3_A279CliNom[0] ;
         A279CliNom = P09ZI3_A279CliNom[0] ;
         AV47faccod = A430FacCod ;
         /* Execute user subroutine: 'FACVTO' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         GXv_decimal1[0] = AV50FacTot ;
         GXv_decimal2[0] = AV51FacBasImp ;
         new app.facturacion.obteneritemsdecfaven(remoteHandle, context).execute( A396EmprCod, A430FacCod, GXv_decimal1, GXv_decimal2) ;
         interfazprimavera.this.AV50FacTot = GXv_decimal1[0] ;
         interfazprimavera.this.AV51FacBasImp = GXv_decimal2[0] ;
         AV34anyo = (short)(GXutil.year( A436FacFch)) ;
         AV35mes = (byte)(GXutil.month( A436FacFch)) ;
         AV36dia = (byte)(GXutil.day( A436FacFch)) ;
         AV33FecFra = GXutil.str( AV34anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV35mes, 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV36dia, 10, 0)), (short)(2), "0") ;
         AV34anyo = (short)(GXutil.year( AV31FacVtoFch)) ;
         AV35mes = (byte)(GXutil.month( AV31FacVtoFch)) ;
         AV36dia = (byte)(GXutil.day( AV31FacVtoFch)) ;
         AV37FecVto = GXutil.str( AV34anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV35mes, 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV36dia, 10, 0)), (short)(2), "0") ;
         AV32TextFileLine = "" ;
         AV32TextFileLine += GXutil.str( A430FacCod, 8, 0) ;
         AV32TextFileLine += AV33FecFra ;
         AV32TextFileLine += AV37FecVto ;
         AV32TextFileLine += GXutil.padl( GXutil.trim( GXutil.str( A252CliCod, 10, 0)), (short)(6), "0") ;
         AV32TextFileLine += A437FacFpg ;
         AV32TextFileLine += GXutil.padl( GXutil.trim( GXutil.str( AV51FacBasImp, 13, 2)), (short)(13), "0") ;
         AV32TextFileLine += GXutil.str( A443FacIVAPor, 2, 0) ;
         AV32TextFileLine += GXutil.padl( GXutil.trim( GXutil.str( AV50FacTot, 13, 2)), (short)(13), "0") ;
         AV32TextFileLine += "EUR" ;
         AV32TextFileLine += "P" ;
         if ( GXutil.len( AV32TextFileLine) > 0 )
         {
            AV20TextFile.writeLine(GXutil.substring( AV32TextFileLine, 2, -1));
         }
         A965FacCob = "S" ;
         AV42CantidadRegistrosProcesados = (short)(AV42CantidadRegistrosProcesados+1) ;
         AV43Porcentaje = (short)((AV42CantidadRegistrosProcesados/ (double) (AV41CantidadRegistrosAProcesar))*100) ;
         AV39ProgressIndicator.setgxTv_SdtProgress_Value( AV43Porcentaje );
         AV39ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV42CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV41CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", ""));
         AV49message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV49message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV42CantidadRegistrosProcesados, 4, 0) );
         AV49message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Registros procesados en CFAVEN", "") );
         AV48messages.add(AV49message, 0);
         /* Using cursor P09ZI4 */
         pr_default.execute(2, new Object[] {A965FacCob, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV49message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV49message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV42CantidadRegistrosProcesados, 4, 0) );
      AV49message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Total Registros Procesados en CFAVEN", "") );
      AV48messages.add(AV49message, 0);
      AV39ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV39ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV39ProgressIndicator.hide();
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV23Filename = GXutil.trim( AV40path) + "FACTURAS" + ".txt" ;
      AV54Var_File = GXutil.trim( AV40path) + "FACTURAS" + ".txt" ;
      AV20TextFile.setSource( AV23Filename );
      if ( AV20TextFile.exists() )
      {
         AV20TextFile.delete();
      }
      AV20TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV20TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV55registrosprocesados = AV42CantidadRegistrosProcesados ;
      AV46Json_Col_Inc_obs = AV48messages.toJSonString(false) ;
      AV20TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV20TextFile.getErrCode() != 0 )
      {
         AV23Filename = "" ;
         AV24ErrorMessage = AV20TextFile.getErrDescription() ;
         AV20TextFile.close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S123( )
   {
      /* 'FACVTO' Routine */
      returnInSub = false ;
      AV31FacVtoFch = GXutil.nullDate() ;
      /* Using cursor P09ZI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV47faccod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A430FacCod = P09ZI5_A430FacCod[0] ;
         A956FacVtoLin = P09ZI5_A956FacVtoLin[0] ;
         A957FacVtoFch = P09ZI5_A957FacVtoFch[0] ;
         n957FacVtoFch = P09ZI5_n957FacVtoFch[0] ;
         AV31FacVtoFch = A957FacVtoFch ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP8[0] = interfazprimavera.this.AV54Var_File;
      this.aP9[0] = interfazprimavera.this.AV46Json_Col_Inc_obs;
      this.aP10[0] = interfazprimavera.this.AV55registrosprocesados;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.interfazprimavera");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54Var_File = "" ;
      AV46Json_Col_Inc_obs = "" ;
      AV40path = "" ;
      AV48messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV39ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      P09ZI2_AV41CantidadRegistrosAProcesar = new short[1] ;
      AV49message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      A965FacCob = "" ;
      P09ZI3_A396EmprCod = new String[] {""} ;
      P09ZI3_A965FacCob = new String[] {""} ;
      P09ZI3_A252CliCod = new int[1] ;
      P09ZI3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZI3_A430FacCod = new int[1] ;
      P09ZI3_A437FacFpg = new String[] {""} ;
      P09ZI3_A443FacIVAPor = new byte[1] ;
      P09ZI3_A279CliNom = new String[] {""} ;
      A437FacFpg = "" ;
      A279CliNom = "" ;
      AV50FacTot = DecimalUtil.ZERO ;
      GXv_decimal1 = new java.math.BigDecimal[1] ;
      AV51FacBasImp = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      AV33FecFra = "" ;
      AV31FacVtoFch = GXutil.nullDate() ;
      AV37FecVto = "" ;
      AV32TextFileLine = "" ;
      AV20TextFile = new com.genexus.util.GXFile();
      AV23Filename = "" ;
      AV24ErrorMessage = "" ;
      P09ZI5_A396EmprCod = new String[] {""} ;
      P09ZI5_A430FacCod = new int[1] ;
      P09ZI5_A956FacVtoLin = new byte[1] ;
      P09ZI5_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZI5_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.interfazprimavera__default(),
         new Object[] {
             new Object[] {
            P09ZI2_AV41CantidadRegistrosAProcesar
            }
            , new Object[] {
            P09ZI3_A396EmprCod, P09ZI3_A965FacCob, P09ZI3_A252CliCod, P09ZI3_A436FacFch, P09ZI3_A430FacCod, P09ZI3_A437FacFpg, P09ZI3_A443FacIVAPor, P09ZI3_A279CliNom
            }
            , new Object[] {
            }
            , new Object[] {
            P09ZI5_A396EmprCod, P09ZI5_A430FacCod, P09ZI5_A956FacVtoLin, P09ZI5_A957FacVtoFch, P09ZI5_n957FacVtoFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A443FacIVAPor ;
   private byte AV35mes ;
   private byte AV36dia ;
   private byte A956FacVtoLin ;
   private short AV55registrosprocesados ;
   private short AV38len ;
   private short AV41CantidadRegistrosAProcesar ;
   private short cV41CantidadRegistrosAProcesar ;
   private short AV42CantidadRegistrosProcesados ;
   private short AV34anyo ;
   private short AV43Porcentaje ;
   private short Gx_err ;
   private int AV19Clicodfrom ;
   private int AV18Clicodto ;
   private int AV15Faccodfrom ;
   private int AV14Faccodto ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV47faccod ;
   private java.math.BigDecimal AV50FacTot ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private java.math.BigDecimal AV51FacBasImp ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String A396EmprCod ;
   private String AV13DirOri ;
   private String AV40path ;
   private String scmdbuf ;
   private String A965FacCob ;
   private String A437FacFpg ;
   private String A279CliNom ;
   private String AV33FecFra ;
   private String AV37FecVto ;
   private java.util.Date AV17Facfchfrom ;
   private java.util.Date AV16Facfchto ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV31FacVtoFch ;
   private java.util.Date A957FacVtoFch ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private String AV54Var_File ;
   private String AV46Json_Col_Inc_obs ;
   private String AV32TextFileLine ;
   private String AV23Filename ;
   private String AV24ErrorMessage ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV39ProgressIndicator ;
   private short[] aP10 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private short[] P09ZI2_AV41CantidadRegistrosAProcesar ;
   private String[] P09ZI3_A396EmprCod ;
   private String[] P09ZI3_A965FacCob ;
   private int[] P09ZI3_A252CliCod ;
   private java.util.Date[] P09ZI3_A436FacFch ;
   private int[] P09ZI3_A430FacCod ;
   private String[] P09ZI3_A437FacFpg ;
   private byte[] P09ZI3_A443FacIVAPor ;
   private String[] P09ZI3_A279CliNom ;
   private String[] P09ZI5_A396EmprCod ;
   private int[] P09ZI5_A430FacCod ;
   private byte[] P09ZI5_A956FacVtoLin ;
   private java.util.Date[] P09ZI5_A957FacVtoFch ;
   private boolean[] P09ZI5_n957FacVtoFch ;
   private com.genexus.util.GXFile AV20TextFile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV48messages ;
   private com.genexus.SdtMessages_Message AV49message ;
}

final  class interfazprimavera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15Faccodfrom ,
                                          int AV14Faccodto ,
                                          java.util.Date AV17Facfchfrom ,
                                          java.util.Date AV16Facfchto ,
                                          int AV19Clicodfrom ,
                                          int AV18Clicodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacCob IS NULL)");
      if ( ! (0==AV15Faccodfrom) )
      {
         addWhere(sWhereString, "(FacCod >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV14Faccodto) )
      {
         addWhere(sWhereString, "(FacCod <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Facfchfrom)) )
      {
         addWhere(sWhereString, "(FacFch >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Facfchto)) )
      {
         addWhere(sWhereString, "(FacFch <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV19Clicodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV18Clicodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P09ZI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15Faccodfrom ,
                                          int AV14Faccodto ,
                                          java.util.Date AV17Facfchfrom ,
                                          java.util.Date AV16Facfchto ,
                                          int AV19Clicodfrom ,
                                          int AV18Clicodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A965FacCob ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[7];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacCob, T1.CliCod, T1.FacFch, T1.FacCod, T1.FacFpg, T1.FacIVAPor, T2.CliNom FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacCob IS NULL)");
      if ( ! (0==AV15Faccodfrom) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV14Faccodto) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Facfchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Facfchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV19Clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV18Clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09ZI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P09ZI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZI3", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09ZI4", "UPDATE TXPCFAVEN SET FacCob=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P09ZI5", "SELECT * FROM (SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}


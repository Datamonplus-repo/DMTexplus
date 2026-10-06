package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pretar2 extends GXProcedure
{
   public pretar2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pretar2.class ), "" );
   }

   public pretar2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 ,
                                                                        long aP3 ,
                                                                        long aP4 ,
                                                                        int aP5 ,
                                                                        int aP6 ,
                                                                        String aP7 )
   {
      pretar2.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        long aP3 ,
                        long aP4 ,
                        int aP5 ,
                        int aP6 ,
                        String aP7 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             long aP3 ,
                             long aP4 ,
                             int aP5 ,
                             int aP6 ,
                             String aP7 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      pretar2.this.AV12EmprCod = aP0;
      pretar2.this.AV26PFecha = aP1;
      pretar2.this.AV27Ufecha = aP2;
      pretar2.this.AV53Albprocod1 = aP3;
      pretar2.this.AV54Albprocod2 = aP4;
      pretar2.this.AV55CliCod1 = aP5;
      pretar2.this.AV56Clicod2 = aP6;
      pretar2.this.AV28Opcion = aP7;
      pretar2.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV57messages.clear();
      AV59registroseliminados = (short)(0) ;
      AV60ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV60ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV60ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV60ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV60ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV60ProgressIndicator.show();
      AV61CantidadRegistrosAProcesar = (short)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV55CliCod1) ,
                                           Integer.valueOf(AV56Clicod2) ,
                                           Long.valueOf(AV53Albprocod1) ,
                                           Long.valueOf(AV54Albprocod2) ,
                                           AV26PFecha ,
                                           AV27Ufecha ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV12EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P01742 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV55CliCod1), Integer.valueOf(AV56Clicod2), Long.valueOf(AV53Albprocod1), Long.valueOf(AV54Albprocod2), AV26PFecha, AV27Ufecha});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P01742_A30AlbProCod[0] ;
         A396EmprCod = P01742_A396EmprCod[0] ;
         A33AlbProEst = P01742_A33AlbProEst[0] ;
         A34AlbProfch = P01742_A34AlbProfch[0] ;
         A1243GuiRemCli = P01742_A1243GuiRemCli[0] ;
         /* Using cursor P01743 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P01743_A130BarCodPar[0] ;
            A132BarCodReo = P01743_A132BarCodReo[0] ;
            A129BarCod = P01743_A129BarCod[0] ;
            A1261BarAlbKgmE = P01743_A1261BarAlbKgmE[0] ;
            /* Optimized group. */
            /* Using cursor P01744 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            cV61CantidadRegistrosAProcesar = P01744_AV61CantidadRegistrosAProcesar[0] ;
            pr_default.close(2);
            AV61CantidadRegistrosAProcesar = (short)(AV61CantidadRegistrosAProcesar+cV61CantidadRegistrosAProcesar*1) ;
            /* End optimized group. */
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV61CantidadRegistrosAProcesar == 0 )
      {
         AV61CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV62CantidadRegistrosProcesados = (short)(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV55CliCod1) ,
                                           Integer.valueOf(AV56Clicod2) ,
                                           Long.valueOf(AV53Albprocod1) ,
                                           Long.valueOf(AV54Albprocod2) ,
                                           AV26PFecha ,
                                           AV27Ufecha ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV12EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P01745 */
      pr_default.execute(3, new Object[] {AV12EmprCod, Integer.valueOf(AV55CliCod1), Integer.valueOf(AV56Clicod2), Long.valueOf(AV53Albprocod1), Long.valueOf(AV54Albprocod2), AV26PFecha, AV27Ufecha});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A30AlbProCod = P01745_A30AlbProCod[0] ;
         A396EmprCod = P01745_A396EmprCod[0] ;
         A33AlbProEst = P01745_A33AlbProEst[0] ;
         A34AlbProfch = P01745_A34AlbProfch[0] ;
         A1243GuiRemCli = P01745_A1243GuiRemCli[0] ;
         /* Using cursor P01746 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P01746_A130BarCodPar[0] ;
            A132BarCodReo = P01746_A132BarCodReo[0] ;
            A129BarCod = P01746_A129BarCod[0] ;
            A1261BarAlbKgmE = P01746_A1261BarAlbKgmE[0] ;
            /* Using cursor P01747 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A1240GuiFasLin = P01747_A1240GuiFasLin[0] ;
               A1242GuiFasPMt = P01747_A1242GuiFasPMt[0] ;
               A1241GuiFasPKg = P01747_A1241GuiFasPKg[0] ;
               A457FasCod = P01747_A457FasCod[0] ;
               A460FasDsc = P01747_A460FasDsc[0] ;
               A460FasDsc = P01747_A460FasDsc[0] ;
               /* Using cursor P01748 */
               pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               AV59registroseliminados = (short)(AV59registroseliminados+1) ;
               AV58message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV58message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV59registroseliminados, 4, 0)) );
               AV58message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Guia ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( " Fase ", "")+GXutil.trim( A457FasCod)+httpContext.getMessage( " Precio kg ", "")+GXutil.trim( GXutil.str( A1241GuiFasPKg, 13, 5))+httpContext.getMessage( " Precio mt ", "")+localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999") );
               AV57messages.add(AV58message, 0);
               AV62CantidadRegistrosProcesados = (short)(AV62CantidadRegistrosProcesados+1) ;
               AV63Porcentaje = (short)((AV62CantidadRegistrosProcesados/ (double) (AV61CantidadRegistrosAProcesar))*100) ;
               AV60ProgressIndicator.setgxTv_SdtProgress_Value( AV63Porcentaje );
               AV60ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Proceso Eliminacion ALBFAS %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV62CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV61CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)), GXutil.trim( A460FasDsc), "", "", "", "", ""));
               pr_default.readNext(5);
            }
            pr_default.close(5);
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV60ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV60ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV60ProgressIndicator.hide();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = pretar2.this.AV57messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "pretar2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV57messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV60ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P01742_A30AlbProCod = new long[1] ;
      P01742_A396EmprCod = new String[] {""} ;
      P01742_A33AlbProEst = new byte[1] ;
      P01742_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01742_A1243GuiRemCli = new int[1] ;
      P01743_A396EmprCod = new String[] {""} ;
      P01743_A30AlbProCod = new long[1] ;
      P01743_A130BarCodPar = new String[] {""} ;
      P01743_A132BarCodReo = new byte[1] ;
      P01743_A129BarCod = new int[1] ;
      P01743_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P01744_AV61CantidadRegistrosAProcesar = new short[1] ;
      P01745_A30AlbProCod = new long[1] ;
      P01745_A396EmprCod = new String[] {""} ;
      P01745_A33AlbProEst = new byte[1] ;
      P01745_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01745_A1243GuiRemCli = new int[1] ;
      P01746_A396EmprCod = new String[] {""} ;
      P01746_A30AlbProCod = new long[1] ;
      P01746_A130BarCodPar = new String[] {""} ;
      P01746_A132BarCodReo = new byte[1] ;
      P01746_A129BarCod = new int[1] ;
      P01746_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01747_A396EmprCod = new String[] {""} ;
      P01747_A30AlbProCod = new long[1] ;
      P01747_A129BarCod = new int[1] ;
      P01747_A132BarCodReo = new byte[1] ;
      P01747_A130BarCodPar = new String[] {""} ;
      P01747_A1240GuiFasLin = new short[1] ;
      P01747_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01747_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01747_A457FasCod = new String[] {""} ;
      P01747_A460FasDsc = new String[] {""} ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV58message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pretar2__default(),
         new Object[] {
             new Object[] {
            P01742_A30AlbProCod, P01742_A396EmprCod, P01742_A33AlbProEst, P01742_A34AlbProfch, P01742_A1243GuiRemCli
            }
            , new Object[] {
            P01743_A396EmprCod, P01743_A30AlbProCod, P01743_A130BarCodPar, P01743_A132BarCodReo, P01743_A129BarCod, P01743_A1261BarAlbKgmE
            }
            , new Object[] {
            P01744_AV61CantidadRegistrosAProcesar
            }
            , new Object[] {
            P01745_A30AlbProCod, P01745_A396EmprCod, P01745_A33AlbProEst, P01745_A34AlbProfch, P01745_A1243GuiRemCli
            }
            , new Object[] {
            P01746_A396EmprCod, P01746_A30AlbProCod, P01746_A130BarCodPar, P01746_A132BarCodReo, P01746_A129BarCod, P01746_A1261BarAlbKgmE
            }
            , new Object[] {
            P01747_A396EmprCod, P01747_A30AlbProCod, P01747_A129BarCod, P01747_A132BarCodReo, P01747_A130BarCodPar, P01747_A1240GuiFasLin, P01747_A1242GuiFasPMt, P01747_A1241GuiFasPKg, P01747_A457FasCod, P01747_A460FasDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private short AV59registroseliminados ;
   private short AV61CantidadRegistrosAProcesar ;
   private short cV61CantidadRegistrosAProcesar ;
   private short AV62CantidadRegistrosProcesados ;
   private short A1240GuiFasLin ;
   private short AV63Porcentaje ;
   private short Gx_err ;
   private int AV55CliCod1 ;
   private int AV56Clicod2 ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private long AV53Albprocod1 ;
   private long AV54Albprocod2 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String AV12EmprCod ;
   private String AV28Opcion ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private java.util.Date AV26PFecha ;
   private java.util.Date AV27Ufecha ;
   private java.util.Date A34AlbProfch ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV60ProgressIndicator ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private long[] P01742_A30AlbProCod ;
   private String[] P01742_A396EmprCod ;
   private byte[] P01742_A33AlbProEst ;
   private java.util.Date[] P01742_A34AlbProfch ;
   private int[] P01742_A1243GuiRemCli ;
   private String[] P01743_A396EmprCod ;
   private long[] P01743_A30AlbProCod ;
   private String[] P01743_A130BarCodPar ;
   private byte[] P01743_A132BarCodReo ;
   private int[] P01743_A129BarCod ;
   private java.math.BigDecimal[] P01743_A1261BarAlbKgmE ;
   private short[] P01744_AV61CantidadRegistrosAProcesar ;
   private long[] P01745_A30AlbProCod ;
   private String[] P01745_A396EmprCod ;
   private byte[] P01745_A33AlbProEst ;
   private java.util.Date[] P01745_A34AlbProfch ;
   private int[] P01745_A1243GuiRemCli ;
   private String[] P01746_A396EmprCod ;
   private long[] P01746_A30AlbProCod ;
   private String[] P01746_A130BarCodPar ;
   private byte[] P01746_A132BarCodReo ;
   private int[] P01746_A129BarCod ;
   private java.math.BigDecimal[] P01746_A1261BarAlbKgmE ;
   private String[] P01747_A396EmprCod ;
   private long[] P01747_A30AlbProCod ;
   private int[] P01747_A129BarCod ;
   private byte[] P01747_A132BarCodReo ;
   private String[] P01747_A130BarCodPar ;
   private short[] P01747_A1240GuiFasLin ;
   private java.math.BigDecimal[] P01747_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P01747_A1241GuiFasPKg ;
   private String[] P01747_A457FasCod ;
   private String[] P01747_A460FasDsc ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV57messages ;
   private com.genexus.SdtMessages_Message AV58message ;
}

final  class pretar2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P01742( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV55CliCod1 ,
                                          int AV56Clicod2 ,
                                          long AV53Albprocod1 ,
                                          long AV54Albprocod2 ,
                                          java.util.Date AV26PFecha ,
                                          java.util.Date AV27Ufecha ,
                                          int A1243GuiRemCli ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          byte A33AlbProEst ,
                                          String AV12EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT AlbProCod, EmprCod, AlbProEst, AlbProfch, GuiRemCli FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProEst < 2)");
      if ( ! (0==AV55CliCod1) )
      {
         addWhere(sWhereString, "(GuiRemCli >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod2) )
      {
         addWhere(sWhereString, "(GuiRemCli <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Albprocod1) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Albprocod2) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26PFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Ufecha)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, GuiRemCli, AlbProCod, AlbProfch" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P01745( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV55CliCod1 ,
                                          int AV56Clicod2 ,
                                          long AV53Albprocod1 ,
                                          long AV54Albprocod2 ,
                                          java.util.Date AV26PFecha ,
                                          java.util.Date AV27Ufecha ,
                                          int A1243GuiRemCli ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          byte A33AlbProEst ,
                                          String AV12EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT AlbProCod, EmprCod, AlbProEst, AlbProfch, GuiRemCli FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProEst < 2)");
      if ( ! (0==AV55CliCod1) )
      {
         addWhere(sWhereString, "(GuiRemCli >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod2) )
      {
         addWhere(sWhereString, "(GuiRemCli <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Albprocod1) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Albprocod2) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26PFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Ufecha)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, GuiRemCli, AlbProCod, AlbProfch" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P01742(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 3 :
                  return conditional_P01745(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01742", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01743", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01744", "SELECT COUNT(*) FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01745", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01746", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01747", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin, T1.GuiFasPMt, T1.GuiFasPKg, T1.FasCod, T2.FasDsc FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01748", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}


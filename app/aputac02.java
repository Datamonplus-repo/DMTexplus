package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputac02 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputac02 pgm = new aputac02 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputac02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputac02.class ), "" );
   }

   public aputac02( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Ajuste TABLA FASQUI)...", "") );
      AV42Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV25EmprCod ;
      GXv_char2[0] = AV43Emprnom ;
      GXv_char3[0] = AV44Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char1, GXv_char2, GXv_char3) ;
      aputac02.this.AV25EmprCod = GXv_char1[0] ;
      aputac02.this.AV43Emprnom = GXv_char2[0] ;
      aputac02.this.AV44Usurcod = GXv_char3[0] ;
      AV34Count = 0 ;
      /* Using cursor P02K72 */
      pr_default.execute(0, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02K72_A396EmprCod[0] ;
         A764ProForCod = P02K72_A764ProForCod[0] ;
         A5371FasQuiLin = P02K72_A5371FasQuiLin[0] ;
         A194BarOrdLin = P02K72_A194BarOrdLin[0] ;
         A758ProCod = P02K72_A758ProCod[0] ;
         A130BarCodPar = P02K72_A130BarCodPar[0] ;
         A132BarCodReo = P02K72_A132BarCodReo[0] ;
         A129BarCod = P02K72_A129BarCod[0] ;
         A14277FasQuiFabs = P02K72_A14277FasQuiFabs[0] ;
         A12125FasQuiAI = P02K72_A12125FasQuiAI[0] ;
         A12124FasQuiAs = P02K72_A12124FasQuiAs[0] ;
         A11506FasQuiAv = P02K72_A11506FasQuiAv[0] ;
         A9722FasQuiVel = P02K72_A9722FasQuiVel[0] ;
         A6665FasQuiObs = P02K72_A6665FasQuiObs[0] ;
         A6664FasQuiGrm = P02K72_A6664FasQuiGrm[0] ;
         A6663FasQuiAnc = P02K72_A6663FasQuiAnc[0] ;
         A6602FasStPl = P02K72_A6602FasStPl[0] ;
         A6601FasOrdPl = P02K72_A6601FasOrdPl[0] ;
         A6600FasFecPl = P02K72_A6600FasFecPl[0] ;
         A6599FasMaqPl = P02K72_A6599FasMaqPl[0] ;
         A5375FasQuiRb = P02K72_A5375FasQuiRb[0] ;
         A5374FasQuiTp = P02K72_A5374FasQuiTp[0] ;
         A5373FasQuiNp = P02K72_A5373FasQuiNp[0] ;
         W396EmprCod = A396EmprCod ;
         if ( GXutil.strcmp(A758ProCod, GXutil.space( (short)(8))) == 0 )
         {
            AV22BarCod = A129BarCod ;
            AV24BarCodPar = A130BarCodPar ;
            AV23BarCodReo = A132BarCodReo ;
            /* Execute user subroutine: 'BARFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPFASQUI

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W194BarOrdLin = A194BarOrdLin ;
            W758ProCod = A758ProCod ;
            W5371FasQuiLin = A5371FasQuiLin ;
            W764ProForCod = A764ProForCod ;
            W5373FasQuiNp = A5373FasQuiNp ;
            W5374FasQuiTp = A5374FasQuiTp ;
            W5375FasQuiRb = A5375FasQuiRb ;
            W6599FasMaqPl = A6599FasMaqPl ;
            W6600FasFecPl = A6600FasFecPl ;
            W6601FasOrdPl = A6601FasOrdPl ;
            W6602FasStPl = A6602FasStPl ;
            A396EmprCod = AV25EmprCod ;
            A129BarCod = AV22BarCod ;
            A132BarCodReo = AV23BarCodReo ;
            A130BarCodPar = AV24BarCodPar ;
            A194BarOrdLin = AV40barordlin ;
            A758ProCod = AV39Procod ;
            A5371FasQuiLin = (short)(10) ;
            A764ProForCod = httpContext.getMessage( "ZZZZZZ", "") ;
            /* Using cursor P02K73 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A6665FasQuiObs, A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI, A14277FasQuiFabs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A194BarOrdLin = W194BarOrdLin ;
            A758ProCod = W758ProCod ;
            A5371FasQuiLin = W5371FasQuiLin ;
            A764ProForCod = W764ProForCod ;
            A5373FasQuiNp = W5373FasQuiNp ;
            A5374FasQuiTp = W5374FasQuiTp ;
            A5375FasQuiRb = W5375FasQuiRb ;
            A6599FasMaqPl = W6599FasMaqPl ;
            A6600FasFecPl = W6600FasFecPl ;
            A6601FasOrdPl = W6601FasOrdPl ;
            A6602FasStPl = W6602FasStPl ;
            /* End Insert */
            Gx_msg = httpContext.getMessage( "&Procod =", "") + AV39Procod + " " + httpContext.getMessage( "Proforcod =", "") + A764ProForCod ;
            System.out.println( Gx_msg );
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "aputac02");
      /* Using cursor P02K74 */
      pr_default.execute(2, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P02K74_A396EmprCod[0] ;
         A6602FasStPl = P02K74_A6602FasStPl[0] ;
         A758ProCod = P02K74_A758ProCod[0] ;
         A129BarCod = P02K74_A129BarCod[0] ;
         A132BarCodReo = P02K74_A132BarCodReo[0] ;
         A130BarCodPar = P02K74_A130BarCodPar[0] ;
         A194BarOrdLin = P02K74_A194BarOrdLin[0] ;
         A5371FasQuiLin = P02K74_A5371FasQuiLin[0] ;
         if ( GXutil.strcmp(A758ProCod, GXutil.space( (short)(8))) == 0 )
         {
            /* Using cursor P02K75 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "Fin Ajuste Ajuste TABLA FASQUI...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P02K76 */
      pr_default.execute(4, new Object[] {AV25EmprCod, Integer.valueOf(AV22BarCod), Byte.valueOf(AV23BarCodReo), AV24BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4905BarFasAcab = P02K76_A4905BarFasAcab[0] ;
         A130BarCodPar = P02K76_A130BarCodPar[0] ;
         A132BarCodReo = P02K76_A132BarCodReo[0] ;
         A129BarCod = P02K76_A129BarCod[0] ;
         A396EmprCod = P02K76_A396EmprCod[0] ;
         A758ProCod = P02K76_A758ProCod[0] ;
         A194BarOrdLin = P02K76_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV39Procod = A758ProCod ;
            AV40barordlin = A194BarOrdLin ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putac02.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputac02");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42Station = "" ;
      AV25EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV43Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV44Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02K72_A396EmprCod = new String[] {""} ;
      P02K72_A764ProForCod = new String[] {""} ;
      P02K72_A5371FasQuiLin = new short[1] ;
      P02K72_A194BarOrdLin = new short[1] ;
      P02K72_A758ProCod = new String[] {""} ;
      P02K72_A130BarCodPar = new String[] {""} ;
      P02K72_A132BarCodReo = new byte[1] ;
      P02K72_A129BarCod = new int[1] ;
      P02K72_A14277FasQuiFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02K72_A12125FasQuiAI = new String[] {""} ;
      P02K72_A12124FasQuiAs = new String[] {""} ;
      P02K72_A11506FasQuiAv = new String[] {""} ;
      P02K72_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02K72_A6665FasQuiObs = new String[] {""} ;
      P02K72_A6664FasQuiGrm = new short[1] ;
      P02K72_A6663FasQuiAnc = new short[1] ;
      P02K72_A6602FasStPl = new byte[1] ;
      P02K72_A6601FasOrdPl = new byte[1] ;
      P02K72_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      P02K72_A6599FasMaqPl = new String[] {""} ;
      P02K72_A5375FasQuiRb = new short[1] ;
      P02K72_A5374FasQuiTp = new short[1] ;
      P02K72_A5373FasQuiNp = new short[1] ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A14277FasQuiFabs = DecimalUtil.ZERO ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      A11506FasQuiAv = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A6665FasQuiObs = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6599FasMaqPl = "" ;
      W396EmprCod = "" ;
      AV24BarCodPar = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W764ProForCod = "" ;
      W6599FasMaqPl = "" ;
      W6600FasFecPl = GXutil.nullDate() ;
      AV39Procod = "" ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      P02K74_A396EmprCod = new String[] {""} ;
      P02K74_A6602FasStPl = new byte[1] ;
      P02K74_A758ProCod = new String[] {""} ;
      P02K74_A129BarCod = new int[1] ;
      P02K74_A132BarCodReo = new byte[1] ;
      P02K74_A130BarCodPar = new String[] {""} ;
      P02K74_A194BarOrdLin = new short[1] ;
      P02K74_A5371FasQuiLin = new short[1] ;
      P02K76_A4905BarFasAcab = new String[] {""} ;
      P02K76_A130BarCodPar = new String[] {""} ;
      P02K76_A132BarCodReo = new byte[1] ;
      P02K76_A129BarCod = new int[1] ;
      P02K76_A396EmprCod = new String[] {""} ;
      P02K76_A758ProCod = new String[] {""} ;
      P02K76_A194BarOrdLin = new short[1] ;
      A4905BarFasAcab = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.aputac02__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.aputac02__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.aputac02__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputac02__default(),
         new Object[] {
             new Object[] {
            P02K72_A396EmprCod, P02K72_A764ProForCod, P02K72_A5371FasQuiLin, P02K72_A194BarOrdLin, P02K72_A758ProCod, P02K72_A130BarCodPar, P02K72_A132BarCodReo, P02K72_A129BarCod, P02K72_A14277FasQuiFabs, P02K72_A12125FasQuiAI,
            P02K72_A12124FasQuiAs, P02K72_A11506FasQuiAv, P02K72_A9722FasQuiVel, P02K72_A6665FasQuiObs, P02K72_A6664FasQuiGrm, P02K72_A6663FasQuiAnc, P02K72_A6602FasStPl, P02K72_A6601FasOrdPl, P02K72_A6600FasFecPl, P02K72_A6599FasMaqPl,
            P02K72_A5375FasQuiRb, P02K72_A5374FasQuiTp, P02K72_A5373FasQuiNp
            }
            , new Object[] {
            }
            , new Object[] {
            P02K74_A396EmprCod, P02K74_A6602FasStPl, P02K74_A758ProCod, P02K74_A129BarCod, P02K74_A132BarCodReo, P02K74_A130BarCodPar, P02K74_A194BarOrdLin, P02K74_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02K76_A4905BarFasAcab, P02K76_A130BarCodPar, P02K76_A132BarCodReo, P02K76_A129BarCod, P02K76_A396EmprCod, P02K76_A758ProCod, P02K76_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A6602FasStPl ;
   private byte A6601FasOrdPl ;
   private byte AV23BarCodReo ;
   private byte W132BarCodReo ;
   private byte W6601FasOrdPl ;
   private byte W6602FasStPl ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short A6664FasQuiGrm ;
   private short A6663FasQuiAnc ;
   private short A5375FasQuiRb ;
   private short A5374FasQuiTp ;
   private short A5373FasQuiNp ;
   private short W194BarOrdLin ;
   private short W5371FasQuiLin ;
   private short W5373FasQuiNp ;
   private short W5374FasQuiTp ;
   private short W5375FasQuiRb ;
   private short AV40barordlin ;
   private short Gx_err ;
   private int AV34Count ;
   private int A129BarCod ;
   private int AV22BarCod ;
   private int GX_INS779 ;
   private int W129BarCod ;
   private java.math.BigDecimal A14277FasQuiFabs ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private String AV42Station ;
   private String AV25EmprCod ;
   private String GXv_char1[] ;
   private String AV43Emprnom ;
   private String GXv_char2[] ;
   private String AV44Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private String A11506FasQuiAv ;
   private String A6599FasMaqPl ;
   private String W396EmprCod ;
   private String AV24BarCodPar ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W764ProForCod ;
   private String W6599FasMaqPl ;
   private String AV39Procod ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String A4905BarFasAcab ;
   private java.util.Date A6600FasFecPl ;
   private java.util.Date W6600FasFecPl ;
   private boolean returnInSub ;
   private String A6665FasQuiObs ;
   private IDataStoreProvider pr_default ;
   private String[] P02K72_A396EmprCod ;
   private String[] P02K72_A764ProForCod ;
   private short[] P02K72_A5371FasQuiLin ;
   private short[] P02K72_A194BarOrdLin ;
   private String[] P02K72_A758ProCod ;
   private String[] P02K72_A130BarCodPar ;
   private byte[] P02K72_A132BarCodReo ;
   private int[] P02K72_A129BarCod ;
   private java.math.BigDecimal[] P02K72_A14277FasQuiFabs ;
   private String[] P02K72_A12125FasQuiAI ;
   private String[] P02K72_A12124FasQuiAs ;
   private String[] P02K72_A11506FasQuiAv ;
   private java.math.BigDecimal[] P02K72_A9722FasQuiVel ;
   private String[] P02K72_A6665FasQuiObs ;
   private short[] P02K72_A6664FasQuiGrm ;
   private short[] P02K72_A6663FasQuiAnc ;
   private byte[] P02K72_A6602FasStPl ;
   private byte[] P02K72_A6601FasOrdPl ;
   private java.util.Date[] P02K72_A6600FasFecPl ;
   private String[] P02K72_A6599FasMaqPl ;
   private short[] P02K72_A5375FasQuiRb ;
   private short[] P02K72_A5374FasQuiTp ;
   private short[] P02K72_A5373FasQuiNp ;
   private String[] P02K74_A396EmprCod ;
   private byte[] P02K74_A6602FasStPl ;
   private String[] P02K74_A758ProCod ;
   private int[] P02K74_A129BarCod ;
   private byte[] P02K74_A132BarCodReo ;
   private String[] P02K74_A130BarCodPar ;
   private short[] P02K74_A194BarOrdLin ;
   private short[] P02K74_A5371FasQuiLin ;
   private String[] P02K76_A4905BarFasAcab ;
   private String[] P02K76_A130BarCodPar ;
   private byte[] P02K76_A132BarCodReo ;
   private int[] P02K76_A129BarCod ;
   private String[] P02K76_A396EmprCod ;
   private String[] P02K76_A758ProCod ;
   private short[] P02K76_A194BarOrdLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class aputac02__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aputac02__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aputac02__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aputac02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02K72", "SELECT EmprCod, ProForCod, FasQuiLin, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, FasQuiFabs, FasQuiAI, FasQuiAs, FasQuiAv, FasQuiVel, FasQuiObs, FasQuiGrm, FasQuiAnc, FasStPl, FasOrdPl, FasFecPl, FasMaqPl, FasQuiRb, FasQuiTp, FasQuiNp FROM TXPFASQUI WHERE EmprCod = ? and FasStPl >= 0 ORDER BY EmprCod, FasStPl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02K73", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P02K74", "SELECT EmprCod, FasStPl, ProCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and FasStPl >= 0 ORDER BY EmprCod, FasStPl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02K75", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P02K76", "SELECT BarFasAcab, BarCodPar, BarCodReo, BarCod, EmprCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 400, false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 1);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 3);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}


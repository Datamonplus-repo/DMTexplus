package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apcarfasq extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apcarfasq pgm = new apcarfasq (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public apcarfasq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apcarfasq.class ), "" );
   }

   public apcarfasq( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      apcarfasq.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      apcarfasq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apcarfasq.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apcarfasq.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apcarfasq.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28fasquilin = (short)(0) ;
      AV29UsurCod = " " ;
      AV31Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV30Emprnom ;
      GXv_char3[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char1, GXv_char2, GXv_char3) ;
      apcarfasq.this.A396EmprCod = GXv_char1[0] ;
      apcarfasq.this.AV30Emprnom = GXv_char2[0] ;
      apcarfasq.this.AV29UsurCod = GXv_char3[0] ;
      AV22Emprcod = A396EmprCod ;
      /* Using cursor P034E2 */
      pr_default.execute(0, new Object[] {AV22Emprcod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4905BarFasAcab = P034E2_A4905BarFasAcab[0] ;
         A4287BarFasFor = P034E2_A4287BarFasFor[0] ;
         A252CliCod = P034E2_A252CliCod[0] ;
         n252CliCod = P034E2_n252CliCod[0] ;
         A212BarSer = P034E2_A212BarSer[0] ;
         A457FasCod = P034E2_A457FasCod[0] ;
         A5372FasQuiUl = P034E2_A5372FasQuiUl[0] ;
         n5372FasQuiUl = P034E2_n5372FasQuiUl[0] ;
         A194BarOrdLin = P034E2_A194BarOrdLin[0] ;
         A758ProCod = P034E2_A758ProCod[0] ;
         A252CliCod = P034E2_A252CliCod[0] ;
         n252CliCod = P034E2_n252CliCod[0] ;
         A212BarSer = P034E2_A212BarSer[0] ;
         if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
            {
               AV22Emprcod = A396EmprCod ;
               AV19CliCod = A252CliCod ;
               AV20ArtCod = A212BarSer ;
               AV21Procod = A758ProCod ;
               AV27BARORDLIN = A194BarOrdLin ;
               AV24barcod = A129BarCod ;
               AV26barcodpar = A130BarCodPar ;
               AV25barcodreo = A132BarCodReo ;
               AV32Fascod = A457FasCod ;
               /* Execute user subroutine: 'ARTFOR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               Gx_msg = httpContext.getMessage( "Fascod=", "") + A457FasCod ;
               System.out.println( Gx_msg );
               if ( ! (GXutil.strcmp("", AV23ARTPROCOD)==0) )
               {
                  AV28fasquilin = (short)(0) ;
                  /* Execute user subroutine: 'FASQUI' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  A5372FasQuiUl = AV28fasquilin ;
                  n5372FasQuiUl = false ;
                  Gx_msg = httpContext.getMessage( "Fascod=", "") + A457FasCod + httpContext.getMessage( "&fasquilin =", "") + GXutil.str( AV28fasquilin, 4, 0) ;
                  System.out.println( Gx_msg );
               }
               /* Using cursor P034E3 */
               pr_default.execute(1, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      AV23ARTPROCOD = " " ;
      /* Using cursor P034E4 */
      pr_default.execute(2, new Object[] {AV22Emprcod, Integer.valueOf(AV19CliCod), AV20ArtCod, AV21Procod, AV32Fascod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P034E4_A457FasCod[0] ;
         A758ProCod = P034E4_A758ProCod[0] ;
         A65ArtCod = P034E4_A65ArtCod[0] ;
         A252CliCod = P034E4_A252CliCod[0] ;
         n252CliCod = P034E4_n252CliCod[0] ;
         A4903FasAcab = P034E4_A4903FasAcab[0] ;
         n4903FasAcab = P034E4_n4903FasAcab[0] ;
         A4286FasForMul = P034E4_A4286FasForMul[0] ;
         n4286FasForMul = P034E4_n4286FasForMul[0] ;
         A4898ArtProCod = P034E4_A4898ArtProCod[0] ;
         A4897ArtProLin = P034E4_A4897ArtProLin[0] ;
         A4903FasAcab = P034E4_A4903FasAcab[0] ;
         n4903FasAcab = P034E4_n4903FasAcab[0] ;
         A4286FasForMul = P034E4_A4286FasForMul[0] ;
         n4286FasForMul = P034E4_n4286FasForMul[0] ;
         if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV23ARTPROCOD = A4898ArtProCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      AV28fasquilin = (short)(AV28fasquilin+1) ;
      /*
         INSERT RECORD ON TABLE TXPFASQUI

      */
      A396EmprCod = AV22Emprcod ;
      A129BarCod = AV24barcod ;
      A132BarCodReo = AV25barcodreo ;
      A130BarCodPar = AV26barcodpar ;
      A758ProCod = AV21Procod ;
      A194BarOrdLin = AV27BARORDLIN ;
      A5371FasQuiLin = AV28fasquilin ;
      A764ProForCod = AV23ARTPROCOD ;
      A5373FasQuiNp = (short)(0) ;
      A5374FasQuiTp = (short)(0) ;
      A5375FasQuiRb = (short)(0) ;
      /* Using cursor P034E5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pcarfasq.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apcarfasq.this.A396EmprCod;
      this.aP1[0] = apcarfasq.this.A129BarCod;
      this.aP2[0] = apcarfasq.this.A132BarCodReo;
      this.aP3[0] = apcarfasq.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "apcarfasq");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29UsurCod = "" ;
      AV31Station = "" ;
      GXv_char1 = new String[1] ;
      AV30Emprnom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV22Emprcod = "" ;
      scmdbuf = "" ;
      P034E2_A129BarCod = new int[1] ;
      P034E2_A132BarCodReo = new byte[1] ;
      P034E2_A130BarCodPar = new String[] {""} ;
      P034E2_A4905BarFasAcab = new String[] {""} ;
      P034E2_A4287BarFasFor = new String[] {""} ;
      P034E2_A396EmprCod = new String[] {""} ;
      P034E2_A252CliCod = new int[1] ;
      P034E2_n252CliCod = new boolean[] {false} ;
      P034E2_A212BarSer = new String[] {""} ;
      P034E2_A457FasCod = new String[] {""} ;
      P034E2_A5372FasQuiUl = new short[1] ;
      P034E2_n5372FasQuiUl = new boolean[] {false} ;
      P034E2_A194BarOrdLin = new short[1] ;
      P034E2_A758ProCod = new String[] {""} ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A212BarSer = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV20ArtCod = "" ;
      AV21Procod = "" ;
      AV26barcodpar = "" ;
      AV32Fascod = "" ;
      Gx_msg = "" ;
      AV23ARTPROCOD = "" ;
      P034E4_A457FasCod = new String[] {""} ;
      P034E4_A758ProCod = new String[] {""} ;
      P034E4_A65ArtCod = new String[] {""} ;
      P034E4_A252CliCod = new int[1] ;
      P034E4_n252CliCod = new boolean[] {false} ;
      P034E4_A396EmprCod = new String[] {""} ;
      P034E4_A4903FasAcab = new String[] {""} ;
      P034E4_n4903FasAcab = new boolean[] {false} ;
      P034E4_A4286FasForMul = new String[] {""} ;
      P034E4_n4286FasForMul = new boolean[] {false} ;
      P034E4_A4898ArtProCod = new String[] {""} ;
      P034E4_A4897ArtProLin = new short[1] ;
      A65ArtCod = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4898ArtProCod = "" ;
      A764ProForCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apcarfasq__default(),
         new Object[] {
             new Object[] {
            P034E2_A129BarCod, P034E2_A132BarCodReo, P034E2_A130BarCodPar, P034E2_A4905BarFasAcab, P034E2_A4287BarFasFor, P034E2_A396EmprCod, P034E2_A252CliCod, P034E2_n252CliCod, P034E2_A212BarSer, P034E2_A457FasCod,
            P034E2_A5372FasQuiUl, P034E2_n5372FasQuiUl, P034E2_A194BarOrdLin, P034E2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P034E4_A457FasCod, P034E4_A758ProCod, P034E4_A65ArtCod, P034E4_A252CliCod, P034E4_A396EmprCod, P034E4_A4903FasAcab, P034E4_n4903FasAcab, P034E4_A4286FasForMul, P034E4_n4286FasForMul, P034E4_A4898ArtProCod,
            P034E4_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV25barcodreo ;
   private short AV28fasquilin ;
   private short A5372FasQuiUl ;
   private short A194BarOrdLin ;
   private short AV27BARORDLIN ;
   private short A4897ArtProLin ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV19CliCod ;
   private int AV24barcod ;
   private int GX_INS779 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV29UsurCod ;
   private String AV31Station ;
   private String GXv_char1[] ;
   private String AV30Emprnom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV22Emprcod ;
   private String scmdbuf ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A212BarSer ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV20ArtCod ;
   private String AV21Procod ;
   private String AV26barcodpar ;
   private String AV32Fascod ;
   private String Gx_msg ;
   private String AV23ARTPROCOD ;
   private String A65ArtCod ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4898ArtProCod ;
   private String A764ProForCod ;
   private String Gx_emsg ;
   private boolean n252CliCod ;
   private boolean n5372FasQuiUl ;
   private boolean returnInSub ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P034E2_A129BarCod ;
   private byte[] P034E2_A132BarCodReo ;
   private String[] P034E2_A130BarCodPar ;
   private String[] P034E2_A4905BarFasAcab ;
   private String[] P034E2_A4287BarFasFor ;
   private String[] P034E2_A396EmprCod ;
   private int[] P034E2_A252CliCod ;
   private boolean[] P034E2_n252CliCod ;
   private String[] P034E2_A212BarSer ;
   private String[] P034E2_A457FasCod ;
   private short[] P034E2_A5372FasQuiUl ;
   private boolean[] P034E2_n5372FasQuiUl ;
   private short[] P034E2_A194BarOrdLin ;
   private String[] P034E2_A758ProCod ;
   private String[] P034E4_A457FasCod ;
   private String[] P034E4_A758ProCod ;
   private String[] P034E4_A65ArtCod ;
   private int[] P034E4_A252CliCod ;
   private boolean[] P034E4_n252CliCod ;
   private String[] P034E4_A396EmprCod ;
   private String[] P034E4_A4903FasAcab ;
   private boolean[] P034E4_n4903FasAcab ;
   private String[] P034E4_A4286FasForMul ;
   private boolean[] P034E4_n4286FasForMul ;
   private String[] P034E4_A4898ArtProCod ;
   private short[] P034E4_A4897ArtProLin ;
}

final  class apcarfasq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P034E2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasAcab, T1.BarFasFor, T1.EmprCod, T2.CliCod, T2.BarSer, T1.FasCod, T1.FasQuiUl, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P034E3", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P034E4", "SELECT T1.FasCod, T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T2.FasAcab, T2.FasForMul, T1.ArtProCod, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P034E5", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
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
               return;
      }
   }

}


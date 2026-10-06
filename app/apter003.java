package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apter003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apter003 pgm = new apter003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apter003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apter003.class ), "" );
   }

   public apter003( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizo Barfas....", "") );
      /* Using cursor P03FC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03FC2_A130BarCodPar[0] ;
         A132BarCodReo = P03FC2_A132BarCodReo[0] ;
         A129BarCod = P03FC2_A129BarCod[0] ;
         A396EmprCod = P03FC2_A396EmprCod[0] ;
         A213BarSit = P03FC2_A213BarSit[0] ;
         A180BarMaqCod = P03FC2_A180BarMaqCod[0] ;
         if ( A213BarSit <= 3 )
         {
            A180BarMaqCod = " " ;
         }
         /* Using cursor P03FC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A153BarFasEst = P03FC3_A153BarFasEst[0] ;
            A4442BarFasDTI = P03FC3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P03FC3_n4442BarFasDTI[0] ;
            A4443BarFasDTF = P03FC3_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P03FC3_n4443BarFasDTF[0] ;
            A3836BarFasPri = P03FC3_A3836BarFasPri[0] ;
            A457FasCod = P03FC3_A457FasCod[0] ;
            A603MaqCodBis = P03FC3_A603MaqCodBis[0] ;
            A194BarOrdLin = P03FC3_A194BarOrdLin[0] ;
            A758ProCod = P03FC3_A758ProCod[0] ;
            if ( A153BarFasEst == 0 )
            {
               A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
               n4442BarFasDTI = false ;
               A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
               n4443BarFasDTF = false ;
               A3836BarFasPri = (byte)(0) ;
               AV9Fascod = A457FasCod ;
               AV10Emprcod = A396EmprCod ;
               /* Execute user subroutine: 'FASPRO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( GXutil.strcmp(AV8Maqcod, " ") != 0 )
               {
                  A603MaqCodBis = AV8Maqcod ;
               }
            }
            /* Using cursor P03FC4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Byte.valueOf(A3836BarFasPri), A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P03FC5 */
         pr_default.execute(3, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV8Maqcod = " " ;
      /* Using cursor P03FC6 */
      pr_default.execute(4, new Object[] {AV10Emprcod, AV9Fascod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A457FasCod = P03FC6_A457FasCod[0] ;
         A396EmprCod = P03FC6_A396EmprCod[0] ;
         A602MaqCod = P03FC6_A602MaqCod[0] ;
         n602MaqCod = P03FC6_n602MaqCod[0] ;
         AV8Maqcod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pter003.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apter003");
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
      P03FC2_A130BarCodPar = new String[] {""} ;
      P03FC2_A132BarCodReo = new byte[1] ;
      P03FC2_A129BarCod = new int[1] ;
      P03FC2_A396EmprCod = new String[] {""} ;
      P03FC2_A213BarSit = new byte[1] ;
      P03FC2_A180BarMaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      P03FC3_A396EmprCod = new String[] {""} ;
      P03FC3_A129BarCod = new int[1] ;
      P03FC3_A132BarCodReo = new byte[1] ;
      P03FC3_A130BarCodPar = new String[] {""} ;
      P03FC3_A153BarFasEst = new byte[1] ;
      P03FC3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03FC3_n4442BarFasDTI = new boolean[] {false} ;
      P03FC3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P03FC3_n4443BarFasDTF = new boolean[] {false} ;
      P03FC3_A3836BarFasPri = new byte[1] ;
      P03FC3_A457FasCod = new String[] {""} ;
      P03FC3_A603MaqCodBis = new String[] {""} ;
      P03FC3_A194BarOrdLin = new short[1] ;
      P03FC3_A758ProCod = new String[] {""} ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV9Fascod = "" ;
      AV10Emprcod = "" ;
      AV8Maqcod = "" ;
      P03FC6_A457FasCod = new String[] {""} ;
      P03FC6_A396EmprCod = new String[] {""} ;
      P03FC6_A602MaqCod = new String[] {""} ;
      P03FC6_n602MaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apter003__default(),
         new Object[] {
             new Object[] {
            P03FC2_A130BarCodPar, P03FC2_A132BarCodReo, P03FC2_A129BarCod, P03FC2_A396EmprCod, P03FC2_A213BarSit, P03FC2_A180BarMaqCod
            }
            , new Object[] {
            P03FC3_A396EmprCod, P03FC3_A129BarCod, P03FC3_A132BarCodReo, P03FC3_A130BarCodPar, P03FC3_A153BarFasEst, P03FC3_A4442BarFasDTI, P03FC3_n4442BarFasDTI, P03FC3_A4443BarFasDTF, P03FC3_n4443BarFasDTF, P03FC3_A3836BarFasPri,
            P03FC3_A457FasCod, P03FC3_A603MaqCodBis, P03FC3_A194BarOrdLin, P03FC3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03FC6_A457FasCod, P03FC6_A396EmprCod, P03FC6_A602MaqCod, P03FC6_n602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV9Fascod ;
   private String AV10Emprcod ;
   private String AV8Maqcod ;
   private String A602MaqCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean returnInSub ;
   private boolean n602MaqCod ;
   private IDataStoreProvider pr_default ;
   private String[] P03FC2_A130BarCodPar ;
   private byte[] P03FC2_A132BarCodReo ;
   private int[] P03FC2_A129BarCod ;
   private String[] P03FC2_A396EmprCod ;
   private byte[] P03FC2_A213BarSit ;
   private String[] P03FC2_A180BarMaqCod ;
   private String[] P03FC3_A396EmprCod ;
   private int[] P03FC3_A129BarCod ;
   private byte[] P03FC3_A132BarCodReo ;
   private String[] P03FC3_A130BarCodPar ;
   private byte[] P03FC3_A153BarFasEst ;
   private java.util.Date[] P03FC3_A4442BarFasDTI ;
   private boolean[] P03FC3_n4442BarFasDTI ;
   private java.util.Date[] P03FC3_A4443BarFasDTF ;
   private boolean[] P03FC3_n4443BarFasDTF ;
   private byte[] P03FC3_A3836BarFasPri ;
   private String[] P03FC3_A457FasCod ;
   private String[] P03FC3_A603MaqCodBis ;
   private short[] P03FC3_A194BarOrdLin ;
   private String[] P03FC3_A758ProCod ;
   private String[] P03FC6_A457FasCod ;
   private String[] P03FC6_A396EmprCod ;
   private String[] P03FC6_A602MaqCod ;
   private boolean[] P03FC6_n602MaqCod ;
}

final  class apter003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03FC2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit <= 6) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03FC3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, BarFasDTI, BarFasDTF, BarFasPri, FasCod, MaqCodBis, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03FC4", "UPDATE TXPBARFAS SET BarFasDTI=?, BarFasDTF=?, BarFasPri=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P03FC5", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P03FC6", "SELECT FasCod, EmprCod, MaqCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               stmt.setByte(3, ((Number) parms[4]).byteValue());
               stmt.setString(4, (String)parms[5], 6);
               stmt.setString(5, (String)parms[6], 3);
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               stmt.setString(9, (String)parms[10], 8);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}


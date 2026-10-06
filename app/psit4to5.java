package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psit4to5 extends GXProcedure
{
   public psit4to5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psit4to5.class ), "" );
   }

   public psit4to5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      psit4to5.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      psit4to5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psit4to5.this.AV14BarCod = aP1[0];
      this.aP1 = aP1;
      psit4to5.this.AV15BarCodReo = aP2[0];
      this.aP2 = aP2;
      psit4to5.this.AV16BarCodPar = aP3[0];
      this.aP3 = aP3;
      psit4to5.this.AV17RecLinMaq = aP4[0];
      this.aP4 = aP4;
      psit4to5.this.AV12Usurcod = aP5[0];
      this.aP5 = aP5;
      psit4to5.this.AV13Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV18MaqPlan ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MQPLSV", ""), GXv_int2) ;
      psit4to5.this.GXt_int1 = GXv_int2[0] ;
      AV18MaqPlan = GXt_int1 ;
      AV10RecMaq = (byte)(0) ;
      /* Using cursor P056Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar, Short.valueOf(AV17RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P056Q2_A2804RecLinMaq[0] ;
         A130BarCodPar = P056Q2_A130BarCodPar[0] ;
         A132BarCodReo = P056Q2_A132BarCodReo[0] ;
         A129BarCod = P056Q2_A129BarCod[0] ;
         AV10RecMaq = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV10RecMaq == 0 )
      {
         /* Using cursor P056Q3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P056Q3_A130BarCodPar[0] ;
            A132BarCodReo = P056Q3_A132BarCodReo[0] ;
            A129BarCod = P056Q3_A129BarCod[0] ;
            A213BarSit = P056Q3_A213BarSit[0] ;
            A180BarMaqCod = P056Q3_A180BarMaqCod[0] ;
            if ( A213BarSit == 4 )
            {
               AV11Inc_obs = httpContext.getMessage( "Cambio SItuacion.", "") + GXutil.newLine( ) ;
               AV11Inc_obs += httpContext.getMessage( "Situacion actual es ", "") + GXutil.str( A213BarSit, 2, 0) + httpContext.getMessage( ", pasa a ", "") + "5" + GXutil.newLine( ) ;
               if ( AV18MaqPlan == 1 )
               {
                  AV11Inc_obs += httpContext.getMessage( "Maquina             ", "") + A180BarMaqCod + httpContext.getMessage( ", pasa a ", "") + " " + GXutil.newLine( ) ;
               }
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV12Usurcod, AV13Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               A213BarSit = (byte)(5) ;
               A180BarMaqCod = ((AV18MaqPlan==1) ? " " : A180BarMaqCod) ;
            }
            /* Using cursor P056Q4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P056Q5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P056Q5_A130BarCodPar[0] ;
            A132BarCodReo = P056Q5_A132BarCodReo[0] ;
            A129BarCod = P056Q5_A129BarCod[0] ;
            A2792TermiCod = P056Q5_A2792TermiCod[0] ;
            A2793BarULinMaq = P056Q5_A2793BarULinMaq[0] ;
            n2793BarULinMaq = P056Q5_n2793BarULinMaq[0] ;
            /* Using cursor P056Q6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A2794BarLinMaq = P056Q6_A2794BarLinMaq[0] ;
               A2795BarMaqPrf = P056Q6_A2795BarMaqPrf[0] ;
               n2795BarMaqPrf = P056Q6_n2795BarMaqPrf[0] ;
               /* Optimized DELETE. */
               /* Using cursor P056Q7 */
               pr_default.execute(5, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
               /* End optimized DELETE. */
               /* Using cursor P056Q8 */
               pr_default.execute(6, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P056Q9 */
            pr_default.execute(7, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psit4to5.this.A396EmprCod;
      this.aP1[0] = psit4to5.this.AV14BarCod;
      this.aP2[0] = psit4to5.this.AV15BarCodReo;
      this.aP3[0] = psit4to5.this.AV16BarCodPar;
      this.aP4[0] = psit4to5.this.AV17RecLinMaq;
      this.aP5[0] = psit4to5.this.AV12Usurcod;
      this.aP6[0] = psit4to5.this.AV13Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "psit4to5");
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
      P056Q2_A396EmprCod = new String[] {""} ;
      P056Q2_A2804RecLinMaq = new short[1] ;
      P056Q2_A130BarCodPar = new String[] {""} ;
      P056Q2_A132BarCodReo = new byte[1] ;
      P056Q2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P056Q3_A396EmprCod = new String[] {""} ;
      P056Q3_A130BarCodPar = new String[] {""} ;
      P056Q3_A132BarCodReo = new byte[1] ;
      P056Q3_A129BarCod = new int[1] ;
      P056Q3_A213BarSit = new byte[1] ;
      P056Q3_A180BarMaqCod = new String[] {""} ;
      A180BarMaqCod = "" ;
      AV11Inc_obs = "" ;
      AV23Pgmname = "" ;
      P056Q5_A396EmprCod = new String[] {""} ;
      P056Q5_A130BarCodPar = new String[] {""} ;
      P056Q5_A132BarCodReo = new byte[1] ;
      P056Q5_A129BarCod = new int[1] ;
      P056Q5_A2792TermiCod = new String[] {""} ;
      P056Q5_A2793BarULinMaq = new short[1] ;
      P056Q5_n2793BarULinMaq = new boolean[] {false} ;
      A2792TermiCod = "" ;
      P056Q6_A396EmprCod = new String[] {""} ;
      P056Q6_A2792TermiCod = new String[] {""} ;
      P056Q6_A129BarCod = new int[1] ;
      P056Q6_A132BarCodReo = new byte[1] ;
      P056Q6_A130BarCodPar = new String[] {""} ;
      P056Q6_A2794BarLinMaq = new short[1] ;
      P056Q6_A2795BarMaqPrf = new String[] {""} ;
      P056Q6_n2795BarMaqPrf = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psit4to5__default(),
         new Object[] {
             new Object[] {
            P056Q2_A396EmprCod, P056Q2_A2804RecLinMaq, P056Q2_A130BarCodPar, P056Q2_A132BarCodReo, P056Q2_A129BarCod
            }
            , new Object[] {
            P056Q3_A396EmprCod, P056Q3_A130BarCodPar, P056Q3_A132BarCodReo, P056Q3_A129BarCod, P056Q3_A213BarSit, P056Q3_A180BarMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P056Q5_A396EmprCod, P056Q5_A130BarCodPar, P056Q5_A132BarCodReo, P056Q5_A129BarCod, P056Q5_A2792TermiCod, P056Q5_A2793BarULinMaq, P056Q5_n2793BarULinMaq
            }
            , new Object[] {
            P056Q6_A396EmprCod, P056Q6_A2792TermiCod, P056Q6_A129BarCod, P056Q6_A132BarCodReo, P056Q6_A130BarCodPar, P056Q6_A2794BarLinMaq, P056Q6_A2795BarMaqPrf, P056Q6_n2795BarMaqPrf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PSit4to5" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PSit4to5" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15BarCodReo ;
   private byte AV18MaqPlan ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV10RecMaq ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV17RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A2793BarULinMaq ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int AV14BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV16BarCodPar ;
   private String AV12Usurcod ;
   private String AV13Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A180BarMaqCod ;
   private String AV23Pgmname ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private boolean n2793BarULinMaq ;
   private boolean n2795BarMaqPrf ;
   private String AV11Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P056Q2_A396EmprCod ;
   private short[] P056Q2_A2804RecLinMaq ;
   private String[] P056Q2_A130BarCodPar ;
   private byte[] P056Q2_A132BarCodReo ;
   private int[] P056Q2_A129BarCod ;
   private String[] P056Q3_A396EmprCod ;
   private String[] P056Q3_A130BarCodPar ;
   private byte[] P056Q3_A132BarCodReo ;
   private int[] P056Q3_A129BarCod ;
   private byte[] P056Q3_A213BarSit ;
   private String[] P056Q3_A180BarMaqCod ;
   private String[] P056Q5_A396EmprCod ;
   private String[] P056Q5_A130BarCodPar ;
   private byte[] P056Q5_A132BarCodReo ;
   private int[] P056Q5_A129BarCod ;
   private String[] P056Q5_A2792TermiCod ;
   private short[] P056Q5_A2793BarULinMaq ;
   private boolean[] P056Q5_n2793BarULinMaq ;
   private String[] P056Q6_A396EmprCod ;
   private String[] P056Q6_A2792TermiCod ;
   private int[] P056Q6_A129BarCod ;
   private byte[] P056Q6_A132BarCodReo ;
   private String[] P056Q6_A130BarCodPar ;
   private short[] P056Q6_A2794BarLinMaq ;
   private String[] P056Q6_A2795BarMaqPrf ;
   private boolean[] P056Q6_n2795BarMaqPrf ;
}

final  class psit4to5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056Q2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056Q3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P056Q4", "UPDATE TXPBARCAD SET BarSit=?, BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P056Q5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, TermiCod, BarULinMaq FROM TXPBARTER WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056Q6", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf FROM TXPBARMAQ WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056Q7", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P056Q8", "DELETE FROM TXPBARMAQ  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P056Q9", "DELETE FROM TXPBARTER  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgencil extends GXProcedure
{
   public pgencil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgencil.class ), "" );
   }

   public pgencil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pgencil.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pgencil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgencil.this.AV15GrpDibCod = aP1[0];
      this.aP1 = aP1;
      pgencil.this.AV16GrcDibCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17NumLin = (byte)(0) ;
      /* Using cursor P00ZE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15GrpDibCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2647MalCod = P00ZE2_A2647MalCod[0] ;
         n2647MalCod = P00ZE2_n2647MalCod[0] ;
         A2581GrpNumLin = P00ZE2_A2581GrpNumLin[0] ;
         A2572GrpColor = P00ZE2_A2572GrpColor[0] ;
         n2572GrpColor = P00ZE2_n2572GrpColor[0] ;
         A2646MalCilRel = P00ZE2_A2646MalCilRel[0] ;
         n2646MalCilRel = P00ZE2_n2646MalCilRel[0] ;
         A2574GrpDibCod = P00ZE2_A2574GrpDibCod[0] ;
         A2646MalCilRel = P00ZE2_A2646MalCilRel[0] ;
         n2646MalCilRel = P00ZE2_n2646MalCilRel[0] ;
         /*
            INSERT RECORD ON TABLE TXPLGRCIL

         */
         A2542GrcDibCod = AV16GrcDibCod ;
         A2551GrcNumLin = A2581GrpNumLin ;
         A2540GrcColor = A2572GrpColor ;
         n2540GrcColor = false ;
         A2549GrcMalla = A2646MalCilRel ;
         n2549GrcMalla = false ;
         /* Using cursor P00ZE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2542GrcDibCod), Byte.valueOf(A2551GrcNumLin), Boolean.valueOf(n2540GrcColor), A2540GrcColor, Boolean.valueOf(n2549GrcMalla), A2549GrcMalla});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLGRCIL");
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
         /* End Insert */
         AV17NumLin = A2581GrpNumLin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      n2553GrcUltLiC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00ZE4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n2553GrcUltLiC), Byte.valueOf(AV17NumLin), A396EmprCod, Integer.valueOf(AV16GrcDibCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRCIL");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgencil.this.A396EmprCod;
      this.aP1[0] = pgencil.this.AV15GrpDibCod;
      this.aP2[0] = pgencil.this.AV16GrcDibCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgencil");
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
      P00ZE2_A2647MalCod = new byte[1] ;
      P00ZE2_n2647MalCod = new boolean[] {false} ;
      P00ZE2_A396EmprCod = new String[] {""} ;
      P00ZE2_A2581GrpNumLin = new byte[1] ;
      P00ZE2_A2572GrpColor = new String[] {""} ;
      P00ZE2_n2572GrpColor = new boolean[] {false} ;
      P00ZE2_A2646MalCilRel = new String[] {""} ;
      P00ZE2_n2646MalCilRel = new boolean[] {false} ;
      P00ZE2_A2574GrpDibCod = new int[1] ;
      A2572GrpColor = "" ;
      A2646MalCilRel = "" ;
      A2540GrcColor = "" ;
      A2549GrcMalla = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgencil__default(),
         new Object[] {
             new Object[] {
            P00ZE2_A2647MalCod, P00ZE2_n2647MalCod, P00ZE2_A396EmprCod, P00ZE2_A2581GrpNumLin, P00ZE2_A2572GrpColor, P00ZE2_n2572GrpColor, P00ZE2_A2646MalCilRel, P00ZE2_n2646MalCilRel, P00ZE2_A2574GrpDibCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17NumLin ;
   private byte A2647MalCod ;
   private byte A2581GrpNumLin ;
   private byte A2551GrcNumLin ;
   private byte A2553GrcUltLiC ;
   private short Gx_err ;
   private int AV15GrpDibCod ;
   private int AV16GrcDibCod ;
   private int A2574GrpDibCod ;
   private int GX_INS562 ;
   private int A2542GrcDibCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A2572GrpColor ;
   private String A2646MalCilRel ;
   private String A2540GrcColor ;
   private String A2549GrcMalla ;
   private String Gx_emsg ;
   private boolean n2647MalCod ;
   private boolean n2572GrpColor ;
   private boolean n2646MalCilRel ;
   private boolean n2540GrcColor ;
   private boolean n2549GrcMalla ;
   private boolean n2553GrcUltLiC ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00ZE2_A2647MalCod ;
   private boolean[] P00ZE2_n2647MalCod ;
   private String[] P00ZE2_A396EmprCod ;
   private byte[] P00ZE2_A2581GrpNumLin ;
   private String[] P00ZE2_A2572GrpColor ;
   private boolean[] P00ZE2_n2572GrpColor ;
   private String[] P00ZE2_A2646MalCilRel ;
   private boolean[] P00ZE2_n2646MalCilRel ;
   private int[] P00ZE2_A2574GrpDibCod ;
}

final  class pgencil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZE2", "SELECT T1.MalCod, T1.EmprCod, T1.GrpNumLin, T1.GrpColor, T2.MalCilRel, T1.GrpDibCod FROM (TXPLGRPEQ T1 LEFT JOIN TXPREMACI T2 ON T2.EmprCod = T1.EmprCod AND T2.MalCod = T1.MalCod) WHERE T1.EmprCod = ? and T1.GrpDibCod = ? ORDER BY T1.EmprCod, T1.GrpDibCod, T1.GrpNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZE3", "INSERT INTO TXPLGRCIL(EmprCod, GrcDibCod, GrcNumLin, GrcColor, GrcMalla) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLGRCIL")
         ,new UpdateCursor("P00ZE4", "UPDATE TXPCGRCIL SET GrcUltLiC=?  WHERE EmprCod = ? and GrcDibCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRCIL")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}


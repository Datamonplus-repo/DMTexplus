package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptex023 extends GXProcedure
{
   public ptex023( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptex023.class ), "" );
   }

   public ptex023( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ptex023.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ptex023.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptex023.this.A6850Tex_NPed = aP1[0];
      this.aP1 = aP1;
      ptex023.this.AV9Tex_tipart = aP2[0];
      this.aP2 = aP2;
      ptex023.this.AV8TipArt_C = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02W72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), AV8TipArt_C});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7402Tex_TipArt = P02W72_A7402Tex_TipArt[0] ;
         A7407Tex_AltOp = P02W72_A7407Tex_AltOp[0] ;
         n7407Tex_AltOp = P02W72_n7407Tex_AltOp[0] ;
         A7406Tex_AncOp = P02W72_A7406Tex_AncOp[0] ;
         n7406Tex_AncOp = P02W72_n7406Tex_AncOp[0] ;
         A7405Tex_TalOP = P02W72_A7405Tex_TalOP[0] ;
         n7405Tex_TalOP = P02W72_n7405Tex_TalOP[0] ;
         A7404Tex_LnOP = P02W72_A7404Tex_LnOP[0] ;
         W396EmprCod = A396EmprCod ;
         W6850Tex_NPed = A6850Tex_NPed ;
         W7402Tex_TipArt = A7402Tex_TipArt ;
         /*
            INSERT RECORD ON TABLE TXPTEX003

         */
         W396EmprCod = A396EmprCod ;
         W6850Tex_NPed = A6850Tex_NPed ;
         W7402Tex_TipArt = A7402Tex_TipArt ;
         W7404Tex_LnOP = A7404Tex_LnOP ;
         A7402Tex_TipArt = AV9Tex_tipart ;
         /* Using cursor P02W73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), A7402Tex_TipArt, Short.valueOf(A7404Tex_LnOP), Boolean.valueOf(n7405Tex_TalOP), A7405Tex_TalOP, Boolean.valueOf(n7406Tex_AncOp), A7406Tex_AncOp, Boolean.valueOf(n7407Tex_AltOp), A7407Tex_AltOp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX003");
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
         A6850Tex_NPed = W6850Tex_NPed ;
         A7402Tex_TipArt = W7402Tex_TipArt ;
         A7404Tex_LnOP = W7404Tex_LnOP ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6850Tex_NPed = W6850Tex_NPed ;
         A7402Tex_TipArt = W7402Tex_TipArt ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptex023.this.A396EmprCod;
      this.aP1[0] = ptex023.this.A6850Tex_NPed;
      this.aP2[0] = ptex023.this.AV9Tex_tipart;
      this.aP3[0] = ptex023.this.AV8TipArt_C;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptex023");
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
      P02W72_A396EmprCod = new String[] {""} ;
      P02W72_A6850Tex_NPed = new int[1] ;
      P02W72_A7402Tex_TipArt = new String[] {""} ;
      P02W72_A7407Tex_AltOp = new String[] {""} ;
      P02W72_n7407Tex_AltOp = new boolean[] {false} ;
      P02W72_A7406Tex_AncOp = new String[] {""} ;
      P02W72_n7406Tex_AncOp = new boolean[] {false} ;
      P02W72_A7405Tex_TalOP = new String[] {""} ;
      P02W72_n7405Tex_TalOP = new boolean[] {false} ;
      P02W72_A7404Tex_LnOP = new short[1] ;
      A7402Tex_TipArt = "" ;
      A7407Tex_AltOp = "" ;
      A7406Tex_AncOp = "" ;
      A7405Tex_TalOP = "" ;
      W396EmprCod = "" ;
      W7402Tex_TipArt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptex023__default(),
         new Object[] {
             new Object[] {
            P02W72_A396EmprCod, P02W72_A6850Tex_NPed, P02W72_A7402Tex_TipArt, P02W72_A7407Tex_AltOp, P02W72_n7407Tex_AltOp, P02W72_A7406Tex_AncOp, P02W72_n7406Tex_AncOp, P02W72_A7405Tex_TalOP, P02W72_n7405Tex_TalOP, P02W72_A7404Tex_LnOP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7404Tex_LnOP ;
   private short W7404Tex_LnOP ;
   private short Gx_err ;
   private int A6850Tex_NPed ;
   private int W6850Tex_NPed ;
   private int GX_INS1040 ;
   private String A396EmprCod ;
   private String AV9Tex_tipart ;
   private String AV8TipArt_C ;
   private String scmdbuf ;
   private String A7402Tex_TipArt ;
   private String A7407Tex_AltOp ;
   private String A7406Tex_AncOp ;
   private String A7405Tex_TalOP ;
   private String W396EmprCod ;
   private String W7402Tex_TipArt ;
   private String Gx_emsg ;
   private boolean n7407Tex_AltOp ;
   private boolean n7406Tex_AncOp ;
   private boolean n7405Tex_TalOP ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02W72_A396EmprCod ;
   private int[] P02W72_A6850Tex_NPed ;
   private String[] P02W72_A7402Tex_TipArt ;
   private String[] P02W72_A7407Tex_AltOp ;
   private boolean[] P02W72_n7407Tex_AltOp ;
   private String[] P02W72_A7406Tex_AncOp ;
   private boolean[] P02W72_n7406Tex_AncOp ;
   private String[] P02W72_A7405Tex_TalOP ;
   private boolean[] P02W72_n7405Tex_TalOP ;
   private short[] P02W72_A7404Tex_LnOP ;
}

final  class ptex023__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02W72", "SELECT EmprCod, Tex_NPed, Tex_TipArt, Tex_AltOp, Tex_AncOp, Tex_TalOP, Tex_LnOP FROM TXPTEX003 WHERE EmprCod = ? and Tex_NPed = ? and Tex_TipArt = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W73", "INSERT INTO TXPTEX003(EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP, Tex_TalOP, Tex_AncOp, Tex_AltOp) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX003")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               return;
      }
   }

}


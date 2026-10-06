package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptex020 extends GXProcedure
{
   public ptex020( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptex020.class ), "" );
   }

   public ptex020( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          short[] aP2 ,
                          String[] aP3 )
   {
      ptex020.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      ptex020.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptex020.this.AV11Tex_nped = aP1[0];
      this.aP1 = aP1;
      ptex020.this.AV12TEX_LIN = aP2[0];
      this.aP2 = aP2;
      ptex020.this.AV13Tex_Tipart = aP3[0];
      this.aP3 = aP3;
      ptex020.this.AV14Tex_Unidad = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Tex004 = (byte)(0) ;
      /* Using cursor P02W52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11Tex_nped), AV13Tex_Tipart});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7402Tex_TipArt = P02W52_A7402Tex_TipArt[0] ;
         A6850Tex_NPed = P02W52_A6850Tex_NPed[0] ;
         AV10Tex004 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV10Tex004 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. Intenta crear Tallas p/item", "") + GXutil.newLine( ) + httpContext.getMessage( "Y no ha introducido las Tallas p/OP-Tipo", "") + GXutil.newLine( ) + httpContext.getMessage( "Debe de ingresar primero Tallas p/OP-Tipo", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV10Tex004 == 1 )
      {
         /* Using cursor P02W53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11Tex_nped), AV13Tex_Tipart});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7405Tex_TalOP = P02W53_A7405Tex_TalOP[0] ;
            n7405Tex_TalOP = P02W53_n7405Tex_TalOP[0] ;
            A7406Tex_AncOp = P02W53_A7406Tex_AncOp[0] ;
            n7406Tex_AncOp = P02W53_n7406Tex_AncOp[0] ;
            A7407Tex_AltOp = P02W53_A7407Tex_AltOp[0] ;
            n7407Tex_AltOp = P02W53_n7407Tex_AltOp[0] ;
            A7402Tex_TipArt = P02W53_A7402Tex_TipArt[0] ;
            A6850Tex_NPed = P02W53_A6850Tex_NPed[0] ;
            A7404Tex_LnOP = P02W53_A7404Tex_LnOP[0] ;
            W396EmprCod = A396EmprCod ;
            W6850Tex_NPed = A6850Tex_NPed ;
            /*
               INSERT RECORD ON TABLE TXPTEX002

            */
            W396EmprCod = A396EmprCod ;
            W6850Tex_NPed = A6850Tex_NPed ;
            A6850Tex_NPed = AV11Tex_nped ;
            A6857Tex_Lin = AV12TEX_LIN ;
            A6996Tex_Ntalla = A7405Tex_TalOP ;
            A6997Tex_Unid = 0 ;
            n6997Tex_Unid = false ;
            A6998Tex_AnchoA = A7406Tex_AncOp ;
            n6998Tex_AnchoA = false ;
            A6999tex_Altura = A7407Tex_AltOp ;
            n6999tex_Altura = false ;
            /* Using cursor P02W54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin), A6996Tex_Ntalla, Boolean.valueOf(n6997Tex_Unid), Integer.valueOf(A6997Tex_Unid), Boolean.valueOf(n6998Tex_AnchoA), A6998Tex_AnchoA, Boolean.valueOf(n6999tex_Altura), A6999tex_Altura});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX002");
            if ( (pr_default.getStatus(2) == 1) )
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
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A6850Tex_NPed = W6850Tex_NPed ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Application.commitDataStores(context, remoteHandle, pr_default, "ptex020");
      }
      httpContext.wjLoc = formatLink("app.ttex001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Tex_nped,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12TEX_LIN,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Tex_Unidad,6,0))}, new String[] {"EmprCod","Tex_NPed","Tex_Lin","Tex_Unidad"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptex020.this.A396EmprCod;
      this.aP1[0] = ptex020.this.AV11Tex_nped;
      this.aP2[0] = ptex020.this.AV12TEX_LIN;
      this.aP3[0] = ptex020.this.AV13Tex_Tipart;
      this.aP4[0] = ptex020.this.AV14Tex_Unidad;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptex020");
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
      P02W52_A396EmprCod = new String[] {""} ;
      P02W52_A7402Tex_TipArt = new String[] {""} ;
      P02W52_A6850Tex_NPed = new int[1] ;
      A7402Tex_TipArt = "" ;
      Gx_msg = "" ;
      P02W53_A396EmprCod = new String[] {""} ;
      P02W53_A7405Tex_TalOP = new String[] {""} ;
      P02W53_n7405Tex_TalOP = new boolean[] {false} ;
      P02W53_A7406Tex_AncOp = new String[] {""} ;
      P02W53_n7406Tex_AncOp = new boolean[] {false} ;
      P02W53_A7407Tex_AltOp = new String[] {""} ;
      P02W53_n7407Tex_AltOp = new boolean[] {false} ;
      P02W53_A7402Tex_TipArt = new String[] {""} ;
      P02W53_A6850Tex_NPed = new int[1] ;
      P02W53_A7404Tex_LnOP = new short[1] ;
      A7405Tex_TalOP = "" ;
      A7406Tex_AncOp = "" ;
      A7407Tex_AltOp = "" ;
      W396EmprCod = "" ;
      A6996Tex_Ntalla = "" ;
      A6998Tex_AnchoA = "" ;
      A6999tex_Altura = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ptex020__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ptex020__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ptex020__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptex020__default(),
         new Object[] {
             new Object[] {
            P02W52_A396EmprCod, P02W52_A7402Tex_TipArt, P02W52_A6850Tex_NPed
            }
            , new Object[] {
            P02W53_A396EmprCod, P02W53_A7405Tex_TalOP, P02W53_n7405Tex_TalOP, P02W53_A7406Tex_AncOp, P02W53_n7406Tex_AncOp, P02W53_A7407Tex_AltOp, P02W53_n7407Tex_AltOp, P02W53_A7402Tex_TipArt, P02W53_A6850Tex_NPed, P02W53_A7404Tex_LnOP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Tex004 ;
   private short AV12TEX_LIN ;
   private short A7404Tex_LnOP ;
   private short A6857Tex_Lin ;
   private short Gx_err ;
   private int AV11Tex_nped ;
   private int AV14Tex_Unidad ;
   private int A6850Tex_NPed ;
   private int W6850Tex_NPed ;
   private int GX_INS990 ;
   private int A6997Tex_Unid ;
   private String A396EmprCod ;
   private String AV13Tex_Tipart ;
   private String scmdbuf ;
   private String A7402Tex_TipArt ;
   private String Gx_msg ;
   private String A7405Tex_TalOP ;
   private String A7406Tex_AncOp ;
   private String A7407Tex_AltOp ;
   private String W396EmprCod ;
   private String A6996Tex_Ntalla ;
   private String A6998Tex_AnchoA ;
   private String A6999tex_Altura ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n7405Tex_TalOP ;
   private boolean n7406Tex_AncOp ;
   private boolean n7407Tex_AltOp ;
   private boolean n6997Tex_Unid ;
   private boolean n6998Tex_AnchoA ;
   private boolean n6999tex_Altura ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02W52_A396EmprCod ;
   private String[] P02W52_A7402Tex_TipArt ;
   private int[] P02W52_A6850Tex_NPed ;
   private String[] P02W53_A396EmprCod ;
   private String[] P02W53_A7405Tex_TalOP ;
   private boolean[] P02W53_n7405Tex_TalOP ;
   private String[] P02W53_A7406Tex_AncOp ;
   private boolean[] P02W53_n7406Tex_AncOp ;
   private String[] P02W53_A7407Tex_AltOp ;
   private boolean[] P02W53_n7407Tex_AltOp ;
   private String[] P02W53_A7402Tex_TipArt ;
   private int[] P02W53_A6850Tex_NPed ;
   private short[] P02W53_A7404Tex_LnOP ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class ptex020__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ptex020__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ptex020__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ptex020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02W52", "SELECT EmprCod, Tex_TipArt, Tex_NPed FROM TXPTEX004 WHERE EmprCod = ? and Tex_NPed = ? and Tex_TipArt = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02W53", "SELECT EmprCod, Tex_TalOP, Tex_AncOp, Tex_AltOp, Tex_TipArt, Tex_NPed, Tex_LnOP FROM TXPTEX003 WHERE EmprCod = ? and Tex_NPed = ? and Tex_TipArt = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02W54", "INSERT INTO TXPTEX002(EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla, Tex_Unid, Tex_AnchoA, tex_Altura) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((int[]) buf[8])[0] = rslt.getInt(6);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
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


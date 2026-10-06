package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_header_trnloaddvcombo extends GXProcedure
{
   public trabajoexterno_header_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_header_trnloaddvcombo.class ), "" );
   }

   public trabajoexterno_header_trnloaddvcombo( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 )
   {
      trabajoexterno_header_trnloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      trabajoexterno_header_trnloaddvcombo.this.AV12ComboName = aP0;
      trabajoexterno_header_trnloaddvcombo.this.AV13TrnMode = aP1;
      trabajoexterno_header_trnloaddvcombo.this.AV14EmprCod = aP2;
      trabajoexterno_header_trnloaddvcombo.this.AV15SalExtAlb = aP3;
      trabajoexterno_header_trnloaddvcombo.this.aP4 = aP4;
      trabajoexterno_header_trnloaddvcombo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      if ( GXutil.strcmp(AV12ComboName, "TrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRNCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "ManCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MANCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_TRNCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0ABM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13738TrnCNom = P0ABM2_A13738TrnCNom[0] ;
         A840TrnCod = P0ABM2_A840TrnCod[0] ;
         n840TrnCod = P0ABM2_n840TrnCod[0] ;
         A841TrnNom = P0ABM2_A841TrnNom[0] ;
         n841TrnNom = P0ABM2_n841TrnNom[0] ;
         A396EmprCod = P0ABM2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ABM3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2253SalExtAlb = P0ABM3_A2253SalExtAlb[0] ;
            A396EmprCod = P0ABM3_A396EmprCod[0] ;
            A840TrnCod = P0ABM3_A840TrnCod[0] ;
            n840TrnCod = P0ABM3_n840TrnCod[0] ;
            AV16SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_MANCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0ABM4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13847ManNomID = P0ABM4_A13847ManNomID[0] ;
         A2248ManCod = P0ABM4_A2248ManCod[0] ;
         A2249ManNom = P0ABM4_A2249ManNom[0] ;
         n2249ManNom = P0ABM4_n2249ManNom[0] ;
         A396EmprCod = P0ABM4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13847ManNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ABM5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15SalExtAlb)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2253SalExtAlb = P0ABM5_A2253SalExtAlb[0] ;
            A396EmprCod = P0ABM5_A396EmprCod[0] ;
            A2248ManCod = P0ABM5_A2248ManCod[0] ;
            AV16SelectedValue = ((0==A2248ManCod) ? "" : GXutil.trim( GXutil.str( A2248ManCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = trabajoexterno_header_trnloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = trabajoexterno_header_trnloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0ABM2_A13738TrnCNom = new String[] {""} ;
      P0ABM2_A840TrnCod = new short[1] ;
      P0ABM2_n840TrnCod = new boolean[] {false} ;
      P0ABM2_A841TrnNom = new String[] {""} ;
      P0ABM2_n841TrnNom = new boolean[] {false} ;
      P0ABM2_A396EmprCod = new String[] {""} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0ABM3_A2253SalExtAlb = new int[1] ;
      P0ABM3_A396EmprCod = new String[] {""} ;
      P0ABM3_A840TrnCod = new short[1] ;
      P0ABM3_n840TrnCod = new boolean[] {false} ;
      P0ABM4_A13847ManNomID = new String[] {""} ;
      P0ABM4_A2248ManCod = new short[1] ;
      P0ABM4_A2249ManNom = new String[] {""} ;
      P0ABM4_n2249ManNom = new boolean[] {false} ;
      P0ABM4_A396EmprCod = new String[] {""} ;
      A13847ManNomID = "" ;
      A2249ManNom = "" ;
      P0ABM5_A2253SalExtAlb = new int[1] ;
      P0ABM5_A396EmprCod = new String[] {""} ;
      P0ABM5_A2248ManCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0ABM2_A13738TrnCNom, P0ABM2_A840TrnCod, P0ABM2_A841TrnNom, P0ABM2_n841TrnNom, P0ABM2_A396EmprCod
            }
            , new Object[] {
            P0ABM3_A2253SalExtAlb, P0ABM3_A396EmprCod, P0ABM3_A840TrnCod, P0ABM3_n840TrnCod
            }
            , new Object[] {
            P0ABM4_A13847ManNomID, P0ABM4_A2248ManCod, P0ABM4_A2249ManNom, P0ABM4_n2249ManNom, P0ABM4_A396EmprCod
            }
            , new Object[] {
            P0ABM5_A2253SalExtAlb, P0ABM5_A396EmprCod, P0ABM5_A2248ManCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int AV15SalExtAlb ;
   private int A2253SalExtAlb ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A841TrnNom ;
   private String A396EmprCod ;
   private String A2249ManNom ;
   private boolean returnInSub ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean n2249ManNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13738TrnCNom ;
   private String A13847ManNomID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABM2_A13738TrnCNom ;
   private short[] P0ABM2_A840TrnCod ;
   private boolean[] P0ABM2_n840TrnCod ;
   private String[] P0ABM2_A841TrnNom ;
   private boolean[] P0ABM2_n841TrnNom ;
   private String[] P0ABM2_A396EmprCod ;
   private int[] P0ABM3_A2253SalExtAlb ;
   private String[] P0ABM3_A396EmprCod ;
   private short[] P0ABM3_A840TrnCod ;
   private boolean[] P0ABM3_n840TrnCod ;
   private String[] P0ABM4_A13847ManNomID ;
   private short[] P0ABM4_A2248ManCod ;
   private String[] P0ABM4_A2249ManNom ;
   private boolean[] P0ABM4_n2249ManNom ;
   private String[] P0ABM4_A396EmprCod ;
   private int[] P0ABM5_A2253SalExtAlb ;
   private String[] P0ABM5_A396EmprCod ;
   private short[] P0ABM5_A2248ManCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class trabajoexterno_header_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABM2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom, EmprCod FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABM3", "SELECT SalExtAlb, EmprCod, TrnCod FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ABM4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, ManCod, ManNom, EmprCod FROM TXPMANUFA ORDER BY ManNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABM5", "SELECT SalExtAlb, EmprCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}


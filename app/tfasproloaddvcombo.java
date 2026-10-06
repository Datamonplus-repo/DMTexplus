package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasproloaddvcombo extends GXProcedure
{
   public tfasproloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasproloaddvcombo.class ), "" );
   }

   public tfasproloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    String aP3 ,
                                                                                    String[] aP4 )
   {
      tfasproloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tfasproloaddvcombo.this.AV12ComboName = aP0;
      tfasproloaddvcombo.this.AV13TrnMode = aP1;
      tfasproloaddvcombo.this.AV14EmprCod = aP2;
      tfasproloaddvcombo.this.AV15FasCod = aP3;
      tfasproloaddvcombo.this.aP4 = aP4;
      tfasproloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "SecCodF") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_SECCODF' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "MaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQCOD' */
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
      /* 'LOADCOMBOITEMS_SECCODF' Routine */
      returnInSub = false ;
      /* Using cursor P0A3D2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13807SecNomFID = P0A3D2_A13807SecNomFID[0] ;
         A6163SecNomF = P0A3D2_A6163SecNomF[0] ;
         n6163SecNomF = P0A3D2_n6163SecNomF[0] ;
         A6162SecCodF = P0A3D2_A6162SecCodF[0] ;
         n6162SecCodF = P0A3D2_n6162SecCodF[0] ;
         A396EmprCod = P0A3D2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A6162SecCodF );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13807SecNomFID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A3D3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P0A3D3_A457FasCod[0] ;
            A396EmprCod = P0A3D3_A396EmprCod[0] ;
            A6162SecCodF = P0A3D3_A6162SecCodF[0] ;
            n6162SecCodF = P0A3D3_n6162SecCodF[0] ;
            AV16SelectedValue = A6162SecCodF ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_MAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A3D4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A607MaqEst = P0A3D4_A607MaqEst[0] ;
         n607MaqEst = P0A3D4_n607MaqEst[0] ;
         A13734MaqCDsc = P0A3D4_A13734MaqCDsc[0] ;
         A602MaqCod = P0A3D4_A602MaqCod[0] ;
         n602MaqCod = P0A3D4_n602MaqCod[0] ;
         A606MaqDsc = P0A3D4_A606MaqDsc[0] ;
         n606MaqDsc = P0A3D4_n606MaqDsc[0] ;
         A396EmprCod = P0A3D4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A3D5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, AV15FasCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A457FasCod = P0A3D5_A457FasCod[0] ;
            A396EmprCod = P0A3D5_A396EmprCod[0] ;
            A602MaqCod = P0A3D5_A602MaqCod[0] ;
            n602MaqCod = P0A3D5_n602MaqCod[0] ;
            AV16SelectedValue = A602MaqCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tfasproloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tfasproloaddvcombo.this.AV10Combo_Data;
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
      P0A3D2_A13807SecNomFID = new String[] {""} ;
      P0A3D2_A6163SecNomF = new String[] {""} ;
      P0A3D2_n6163SecNomF = new boolean[] {false} ;
      P0A3D2_A6162SecCodF = new String[] {""} ;
      P0A3D2_n6162SecCodF = new boolean[] {false} ;
      P0A3D2_A396EmprCod = new String[] {""} ;
      A13807SecNomFID = "" ;
      A6163SecNomF = "" ;
      A6162SecCodF = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A3D3_A457FasCod = new String[] {""} ;
      P0A3D3_A396EmprCod = new String[] {""} ;
      P0A3D3_A6162SecCodF = new String[] {""} ;
      P0A3D3_n6162SecCodF = new boolean[] {false} ;
      A457FasCod = "" ;
      P0A3D4_A607MaqEst = new String[] {""} ;
      P0A3D4_n607MaqEst = new boolean[] {false} ;
      P0A3D4_A13734MaqCDsc = new String[] {""} ;
      P0A3D4_A602MaqCod = new String[] {""} ;
      P0A3D4_n602MaqCod = new boolean[] {false} ;
      P0A3D4_A606MaqDsc = new String[] {""} ;
      P0A3D4_n606MaqDsc = new boolean[] {false} ;
      P0A3D4_A396EmprCod = new String[] {""} ;
      A607MaqEst = "" ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P0A3D5_A457FasCod = new String[] {""} ;
      P0A3D5_A396EmprCod = new String[] {""} ;
      P0A3D5_A602MaqCod = new String[] {""} ;
      P0A3D5_n602MaqCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasproloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A3D2_A13807SecNomFID, P0A3D2_A6163SecNomF, P0A3D2_n6163SecNomF, P0A3D2_A6162SecCodF, P0A3D2_A396EmprCod
            }
            , new Object[] {
            P0A3D3_A457FasCod, P0A3D3_A396EmprCod, P0A3D3_A6162SecCodF, P0A3D3_n6162SecCodF
            }
            , new Object[] {
            P0A3D4_A607MaqEst, P0A3D4_n607MaqEst, P0A3D4_A13734MaqCDsc, P0A3D4_A602MaqCod, P0A3D4_A606MaqDsc, P0A3D4_n606MaqDsc, P0A3D4_A396EmprCod
            }
            , new Object[] {
            P0A3D5_A457FasCod, P0A3D5_A396EmprCod, P0A3D5_A602MaqCod, P0A3D5_n602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15FasCod ;
   private String scmdbuf ;
   private String A6163SecNomF ;
   private String A6162SecCodF ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A607MaqEst ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private boolean returnInSub ;
   private boolean n6163SecNomF ;
   private boolean n6162SecCodF ;
   private boolean n607MaqEst ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13807SecNomFID ;
   private String A13734MaqCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3D2_A13807SecNomFID ;
   private String[] P0A3D2_A6163SecNomF ;
   private boolean[] P0A3D2_n6163SecNomF ;
   private String[] P0A3D2_A6162SecCodF ;
   private boolean[] P0A3D2_n6162SecCodF ;
   private String[] P0A3D2_A396EmprCod ;
   private String[] P0A3D3_A457FasCod ;
   private String[] P0A3D3_A396EmprCod ;
   private String[] P0A3D3_A6162SecCodF ;
   private boolean[] P0A3D3_n6162SecCodF ;
   private String[] P0A3D4_A607MaqEst ;
   private boolean[] P0A3D4_n607MaqEst ;
   private String[] P0A3D4_A13734MaqCDsc ;
   private String[] P0A3D4_A602MaqCod ;
   private boolean[] P0A3D4_n602MaqCod ;
   private String[] P0A3D4_A606MaqDsc ;
   private boolean[] P0A3D4_n606MaqDsc ;
   private String[] P0A3D4_A396EmprCod ;
   private String[] P0A3D5_A457FasCod ;
   private String[] P0A3D5_A396EmprCod ;
   private String[] P0A3D5_A602MaqCod ;
   private boolean[] P0A3D5_n602MaqCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tfasproloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3D2", "SELECT RTRIM(LTRIM(COALESCE( SecNomF, ''))) || '(' || RTRIM(LTRIM(SecCodF)) || ')' AS SecNomFID, SecNomF, SecCodF, EmprCod FROM TXPTSECCI ORDER BY SecNomFID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3D3", "SELECT FasCod, EmprCod, SecCodF FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A3D4", "SELECT MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE MaqEst = 'A' ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3D5", "SELECT FasCod, EmprCod, MaqCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 3 :
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}


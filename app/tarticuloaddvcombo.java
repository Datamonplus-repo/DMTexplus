package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticuloaddvcombo extends GXProcedure
{
   public tarticuloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticuloaddvcombo.class ), "" );
   }

   public tarticuloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String aP4 ,
                                                                                    String[] aP5 )
   {
      tarticuloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      tarticuloaddvcombo.this.AV13ComboName = aP0;
      tarticuloaddvcombo.this.AV15TrnMode = aP1;
      tarticuloaddvcombo.this.AV17EmprCod = aP2;
      tarticuloaddvcombo.this.AV18CliCod = aP3;
      tarticuloaddvcombo.this.AV19ArtCod = aP4;
      tarticuloaddvcombo.this.aP5 = aP5;
      tarticuloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV13ComboName, "ClasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLASCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
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
      /* 'LOADCOMBOITEMS_CLASCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09NC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13804ClasDscID = P09NC2_A13804ClasDscID[0] ;
         A4295ClasCod = P09NC2_A4295ClasCod[0] ;
         n4295ClasCod = P09NC2_n4295ClasCod[0] ;
         A4296ClasDsc = P09NC2_A4296ClasDsc[0] ;
         n4296ClasDsc = P09NC2_n4296ClasDsc[0] ;
         A396EmprCod = P09NC2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4295ClasCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13804ClasDscID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09NC3 */
         pr_default.execute(1, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A65ArtCod = P09NC3_A65ArtCod[0] ;
            A252CliCod = P09NC3_A252CliCod[0] ;
            A396EmprCod = P09NC3_A396EmprCod[0] ;
            A4295ClasCod = P09NC3_A4295ClasCod[0] ;
            n4295ClasCod = P09NC3_n4295ClasCod[0] ;
            AV12SelectedValue = ((0==A4295ClasCod) ? "" : GXutil.trim( GXutil.str( A4295ClasCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P09NC4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = P09NC4_A10045CliAct[0] ;
         A13735CliCNom = P09NC4_A13735CliCNom[0] ;
         A252CliCod = P09NC4_A252CliCod[0] ;
         A279CliNom = P09NC4_A279CliNom[0] ;
         A396EmprCod = P09NC4_A396EmprCod[0] ;
         if ( GXutil.strcmp(A10045CliAct, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09NC5 */
         pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A65ArtCod = P09NC5_A65ArtCod[0] ;
            A252CliCod = P09NC5_A252CliCod[0] ;
            A396EmprCod = P09NC5_A396EmprCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         if ( ! (0==AV18CliCod) )
         {
            AV12SelectedValue = GXutil.trim( GXutil.str( AV18CliCod, 6, 0)) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = tarticuloaddvcombo.this.AV12SelectedValue;
      this.aP6[0] = tarticuloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09NC2_A13804ClasDscID = new String[] {""} ;
      P09NC2_A4295ClasCod = new short[1] ;
      P09NC2_n4295ClasCod = new boolean[] {false} ;
      P09NC2_A4296ClasDsc = new String[] {""} ;
      P09NC2_n4296ClasDsc = new boolean[] {false} ;
      P09NC2_A396EmprCod = new String[] {""} ;
      A13804ClasDscID = "" ;
      A4296ClasDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09NC3_A65ArtCod = new String[] {""} ;
      P09NC3_A252CliCod = new int[1] ;
      P09NC3_A396EmprCod = new String[] {""} ;
      P09NC3_A4295ClasCod = new short[1] ;
      P09NC3_n4295ClasCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P09NC4_A10045CliAct = new String[] {""} ;
      P09NC4_A13735CliCNom = new String[] {""} ;
      P09NC4_A252CliCod = new int[1] ;
      P09NC4_A279CliNom = new String[] {""} ;
      P09NC4_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P09NC5_A65ArtCod = new String[] {""} ;
      P09NC5_A252CliCod = new int[1] ;
      P09NC5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticuloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09NC2_A13804ClasDscID, P09NC2_A4295ClasCod, P09NC2_A4296ClasDsc, P09NC2_n4296ClasDsc, P09NC2_A396EmprCod
            }
            , new Object[] {
            P09NC3_A65ArtCod, P09NC3_A252CliCod, P09NC3_A396EmprCod, P09NC3_A4295ClasCod, P09NC3_n4295ClasCod
            }
            , new Object[] {
            P09NC4_A10045CliAct, P09NC4_A13735CliCNom, P09NC4_A252CliCod, P09NC4_A279CliNom, P09NC4_A396EmprCod
            }
            , new Object[] {
            P09NC5_A65ArtCod, P09NC5_A252CliCod, P09NC5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV18CliCod ;
   private int A252CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV19ArtCod ;
   private String scmdbuf ;
   private String A4296ClasDsc ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13804ClasDscID ;
   private String A13735CliCNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09NC2_A13804ClasDscID ;
   private short[] P09NC2_A4295ClasCod ;
   private boolean[] P09NC2_n4295ClasCod ;
   private String[] P09NC2_A4296ClasDsc ;
   private boolean[] P09NC2_n4296ClasDsc ;
   private String[] P09NC2_A396EmprCod ;
   private String[] P09NC3_A65ArtCod ;
   private int[] P09NC3_A252CliCod ;
   private String[] P09NC3_A396EmprCod ;
   private short[] P09NC3_A4295ClasCod ;
   private boolean[] P09NC3_n4295ClasCod ;
   private String[] P09NC4_A10045CliAct ;
   private String[] P09NC4_A13735CliCNom ;
   private int[] P09NC4_A252CliCod ;
   private String[] P09NC4_A279CliNom ;
   private String[] P09NC4_A396EmprCod ;
   private String[] P09NC5_A65ArtCod ;
   private int[] P09NC5_A252CliCod ;
   private String[] P09NC5_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tarticuloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NC2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ClasCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ClasDsc, ''))) AS ClasDscID, ClasCod, ClasDsc, EmprCod FROM TXPCLAPEN ORDER BY ClasDscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NC3", "SELECT ArtCod, CliCod, EmprCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09NC4", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NC5", "SELECT ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}


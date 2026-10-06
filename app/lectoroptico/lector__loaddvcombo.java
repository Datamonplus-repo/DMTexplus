package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lector__loaddvcombo extends GXProcedure
{
   public lector__loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lector__loaddvcombo.class ), "" );
   }

   public lector__loaddvcombo( int remoteHandle ,
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
      lector__loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      lector__loaddvcombo.this.AV12ComboName = aP0;
      lector__loaddvcombo.this.AV13TrnMode = aP1;
      lector__loaddvcombo.this.AV14EmprCod = aP2;
      lector__loaddvcombo.this.AV15LecMaqCod = aP3;
      lector__loaddvcombo.this.aP4 = aP4;
      lector__loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "LecOpeCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECOPECOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "LecParCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECPARCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "LecMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECMAQCOD' */
         S131 ();
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
      /* 'LOADCOMBOITEMS_LECOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A382 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13748OpeCNom = P0A382_A13748OpeCNom[0] ;
         A652OpeCod = P0A382_A652OpeCod[0] ;
         A653OpeNom = P0A382_A653OpeNom[0] ;
         n653OpeNom = P0A382_n653OpeNom[0] ;
         A396EmprCod = P0A382_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A383 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1166LecMaqCod = P0A383_A1166LecMaqCod[0] ;
            A396EmprCod = P0A383_A396EmprCod[0] ;
            A1170LecOpeCod = P0A383_A1170LecOpeCod[0] ;
            n1170LecOpeCod = P0A383_n1170LecOpeCod[0] ;
            AV16SelectedValue = ((0==A1170LecOpeCod) ? "" : GXutil.trim( GXutil.str( A1170LecOpeCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_LECPARCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A384 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13824ParCodNomI = P0A384_A13824ParCodNomI[0] ;
         A656ParCod = P0A384_A656ParCod[0] ;
         A867ParCodNom = P0A384_A867ParCodNom[0] ;
         n867ParCodNom = P0A384_n867ParCodNom[0] ;
         A396EmprCod = P0A384_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A656ParCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13824ParCodNomI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A385 */
         pr_default.execute(3, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1166LecMaqCod = P0A385_A1166LecMaqCod[0] ;
            A396EmprCod = P0A385_A396EmprCod[0] ;
            A1172LecParCod = P0A385_A1172LecParCod[0] ;
            n1172LecParCod = P0A385_n1172LecParCod[0] ;
            AV16SelectedValue = ((0==A1172LecParCod) ? "" : GXutil.trim( GXutil.str( A1172LecParCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_LECMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A386 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A607MaqEst = P0A386_A607MaqEst[0] ;
         n607MaqEst = P0A386_n607MaqEst[0] ;
         A620MaqTip = P0A386_A620MaqTip[0] ;
         n620MaqTip = P0A386_n620MaqTip[0] ;
         A13734MaqCDsc = P0A386_A13734MaqCDsc[0] ;
         A602MaqCod = P0A386_A602MaqCod[0] ;
         A606MaqDsc = P0A386_A606MaqDsc[0] ;
         n606MaqDsc = P0A386_n606MaqDsc[0] ;
         A396EmprCod = P0A386_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A387 */
         pr_default.execute(5, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1166LecMaqCod = P0A387_A1166LecMaqCod[0] ;
            A396EmprCod = P0A387_A396EmprCod[0] ;
            AV16SelectedValue = A1166LecMaqCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV15LecMaqCod)==0) )
         {
            AV16SelectedValue = AV15LecMaqCod ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = lector__loaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = lector__loaddvcombo.this.AV10Combo_Data;
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
      P0A382_A13748OpeCNom = new String[] {""} ;
      P0A382_A652OpeCod = new int[1] ;
      P0A382_A653OpeNom = new String[] {""} ;
      P0A382_n653OpeNom = new boolean[] {false} ;
      P0A382_A396EmprCod = new String[] {""} ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A383_A1166LecMaqCod = new String[] {""} ;
      P0A383_A396EmprCod = new String[] {""} ;
      P0A383_A1170LecOpeCod = new int[1] ;
      P0A383_n1170LecOpeCod = new boolean[] {false} ;
      A1166LecMaqCod = "" ;
      P0A384_A13824ParCodNomI = new String[] {""} ;
      P0A384_A656ParCod = new short[1] ;
      P0A384_A867ParCodNom = new String[] {""} ;
      P0A384_n867ParCodNom = new boolean[] {false} ;
      P0A384_A396EmprCod = new String[] {""} ;
      A13824ParCodNomI = "" ;
      A867ParCodNom = "" ;
      P0A385_A1166LecMaqCod = new String[] {""} ;
      P0A385_A396EmprCod = new String[] {""} ;
      P0A385_A1172LecParCod = new short[1] ;
      P0A385_n1172LecParCod = new boolean[] {false} ;
      P0A386_A607MaqEst = new String[] {""} ;
      P0A386_n607MaqEst = new boolean[] {false} ;
      P0A386_A620MaqTip = new String[] {""} ;
      P0A386_n620MaqTip = new boolean[] {false} ;
      P0A386_A13734MaqCDsc = new String[] {""} ;
      P0A386_A602MaqCod = new String[] {""} ;
      P0A386_A606MaqDsc = new String[] {""} ;
      P0A386_n606MaqDsc = new boolean[] {false} ;
      P0A386_A396EmprCod = new String[] {""} ;
      A607MaqEst = "" ;
      A620MaqTip = "" ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P0A387_A1166LecMaqCod = new String[] {""} ;
      P0A387_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector__loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A382_A13748OpeCNom, P0A382_A652OpeCod, P0A382_A653OpeNom, P0A382_n653OpeNom, P0A382_A396EmprCod
            }
            , new Object[] {
            P0A383_A1166LecMaqCod, P0A383_A396EmprCod, P0A383_A1170LecOpeCod, P0A383_n1170LecOpeCod
            }
            , new Object[] {
            P0A384_A13824ParCodNomI, P0A384_A656ParCod, P0A384_A867ParCodNom, P0A384_n867ParCodNom, P0A384_A396EmprCod
            }
            , new Object[] {
            P0A385_A1166LecMaqCod, P0A385_A396EmprCod, P0A385_A1172LecParCod, P0A385_n1172LecParCod
            }
            , new Object[] {
            P0A386_A607MaqEst, P0A386_n607MaqEst, P0A386_A620MaqTip, P0A386_n620MaqTip, P0A386_A13734MaqCDsc, P0A386_A602MaqCod, P0A386_A606MaqDsc, P0A386_n606MaqDsc, P0A386_A396EmprCod
            }
            , new Object[] {
            P0A387_A1166LecMaqCod, P0A387_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short A1172LecParCod ;
   private short Gx_err ;
   private int A652OpeCod ;
   private int A1170LecOpeCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15LecMaqCod ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String A867ParCodNom ;
   private String A607MaqEst ;
   private String A620MaqTip ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private boolean returnInSub ;
   private boolean n653OpeNom ;
   private boolean n1170LecOpeCod ;
   private boolean n867ParCodNom ;
   private boolean n1172LecParCod ;
   private boolean n607MaqEst ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13748OpeCNom ;
   private String A13824ParCodNomI ;
   private String A13734MaqCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A382_A13748OpeCNom ;
   private int[] P0A382_A652OpeCod ;
   private String[] P0A382_A653OpeNom ;
   private boolean[] P0A382_n653OpeNom ;
   private String[] P0A382_A396EmprCod ;
   private String[] P0A383_A1166LecMaqCod ;
   private String[] P0A383_A396EmprCod ;
   private int[] P0A383_A1170LecOpeCod ;
   private boolean[] P0A383_n1170LecOpeCod ;
   private String[] P0A384_A13824ParCodNomI ;
   private short[] P0A384_A656ParCod ;
   private String[] P0A384_A867ParCodNom ;
   private boolean[] P0A384_n867ParCodNom ;
   private String[] P0A384_A396EmprCod ;
   private String[] P0A385_A1166LecMaqCod ;
   private String[] P0A385_A396EmprCod ;
   private short[] P0A385_A1172LecParCod ;
   private boolean[] P0A385_n1172LecParCod ;
   private String[] P0A386_A607MaqEst ;
   private boolean[] P0A386_n607MaqEst ;
   private String[] P0A386_A620MaqTip ;
   private boolean[] P0A386_n620MaqTip ;
   private String[] P0A386_A13734MaqCDsc ;
   private String[] P0A386_A602MaqCod ;
   private String[] P0A386_A606MaqDsc ;
   private boolean[] P0A386_n606MaqDsc ;
   private String[] P0A386_A396EmprCod ;
   private String[] P0A387_A1166LecMaqCod ;
   private String[] P0A387_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class lector__loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A382", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom, EmprCod FROM TXPOPERAR ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A383", "SELECT LecMaqCod, EmprCod, LecOpeCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A384", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ParCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParCodNom, ''))) AS ParCodNomI, ParCod, ParCodNom, EmprCod FROM TXPCODPAR ORDER BY ParCodNomI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A385", "SELECT LecMaqCod, EmprCod, LecParCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A386", "SELECT MaqEst, MaqTip, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE (MaqEst = 'A') AND (MaqTip = 'E') ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A387", "SELECT LecMaqCod, EmprCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}


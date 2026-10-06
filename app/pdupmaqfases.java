package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdupmaqfases extends GXProcedure
{
   public pdupmaqfases( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdupmaqfases.class ), "" );
   }

   public pdupmaqfases( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      pdupmaqfases.this.AV8emprcod = aP0;
      pdupmaqfases.this.AV9Maqcod1 = aP1;
      pdupmaqfases.this.AV10Fascod1 = aP2;
      pdupmaqfases.this.AV12FasDsc1 = aP3;
      pdupmaqfases.this.AV11MaqCod2 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13FasActiva ;
      GXv_char2[0] = GXt_char1 ;
      new app.faseactiva(remoteHandle, context).execute( AV8emprcod, AV10Fascod1, GXv_char2) ;
      pdupmaqfases.this.GXt_char1 = GXv_char2[0] ;
      AV13FasActiva = GXt_char1 ;
      if ( GXutil.strcmp(AV13FasActiva, "S") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPMAQFAS

         */
         A396EmprCod = AV8emprcod ;
         A602MaqCod = AV11MaqCod2 ;
         A1142MaqFCod = AV10Fascod1 ;
         A1143MaqFDsc = AV12FasDsc1 ;
         /* Using cursor P05SB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod, A1143MaqFDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
         if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pdupmaqfases");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13FasActiva = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A1142MaqFCod = "" ;
      A1143MaqFDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdupmaqfases__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS152 ;
   private String AV8emprcod ;
   private String AV9Maqcod1 ;
   private String AV10Fascod1 ;
   private String AV12FasDsc1 ;
   private String AV11MaqCod2 ;
   private String AV13FasActiva ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String A1143MaqFDsc ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class pdupmaqfases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05SB2", "INSERT INTO TXPMAQFAS(EmprCod, MaqCod, MaqFCod, MaqFDsc) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQFAS")
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 28);
               return;
      }
   }

}


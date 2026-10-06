package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inscmacro extends GXProcedure
{
   public inscmacro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inscmacro.class ), "" );
   }

   public inscmacro( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 )
   {
      inscmacro.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 )
   {
      inscmacro.this.AV10EmprCod = aP0;
      inscmacro.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8MacCod ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( AV10EmprCod, "444444", GXv_int2) ;
      inscmacro.this.GXt_int1 = GXv_int2[0] ;
      AV8MacCod = GXt_int1 ;
      /*
         INSERT RECORD ON TABLE TXPCMACRO

      */
      A396EmprCod = AV10EmprCod ;
      A1199MacCod = AV8MacCod ;
      A1200MacUltLin = (short)(0) ;
      n1200MacUltLin = false ;
      /* Using cursor P08Y12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = inscmacro.this.AV8MacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "core.inscmacro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.inscmacro__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1200MacUltLin ;
   private short Gx_err ;
   private int AV8MacCod ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int GX_INS167 ;
   private int A1199MacCod ;
   private String AV10EmprCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n1200MacUltLin ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class inscmacro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P08Y12", "INSERT INTO TXPCMACRO(EmprCod, MacCod, MacUltLin) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
      }
   }

}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxalbealm extends GXProcedure
{
   public pvxalbealm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxalbealm.class ), "" );
   }

   public pvxalbealm( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 )
   {
      pvxalbealm.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             String[] aP1 )
   {
      pvxalbealm.this.AV9AlbRecCod = aP0;
      pvxalbealm.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8VxStMAlmCod = "" ;
      /* Using cursor P05RH2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV9AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13134VxStMNOf = P05RH2_A13134VxStMNOf[0] ;
         n13134VxStMNOf = P05RH2_n13134VxStMNOf[0] ;
         A12254VxStMTip = P05RH2_A12254VxStMTip[0] ;
         A13135VxStAlmCod = P05RH2_A13135VxStAlmCod[0] ;
         n13135VxStAlmCod = P05RH2_n13135VxStAlmCod[0] ;
         A12255VxStMCod = P05RH2_A12255VxStMCod[0] ;
         if ( GXutil.strcmp(A12254VxStMTip, httpContext.getMessage( "TP", "")) == 0 )
         {
            AV10VxStAlmCod = A13135VxStAlmCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxalbealm.this.AV10VxStAlmCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10VxStAlmCod = "" ;
      AV8VxStMAlmCod = "" ;
      scmdbuf = "" ;
      P05RH2_A13134VxStMNOf = new int[1] ;
      P05RH2_n13134VxStMNOf = new boolean[] {false} ;
      P05RH2_A12254VxStMTip = new String[] {""} ;
      P05RH2_A13135VxStAlmCod = new String[] {""} ;
      P05RH2_n13135VxStAlmCod = new boolean[] {false} ;
      P05RH2_A12255VxStMCod = new int[1] ;
      A12254VxStMTip = "" ;
      A13135VxStAlmCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxalbealm__default(),
         new Object[] {
             new Object[] {
            P05RH2_A13134VxStMNOf, P05RH2_n13134VxStMNOf, P05RH2_A12254VxStMTip, P05RH2_A13135VxStAlmCod, P05RH2_n13135VxStAlmCod, P05RH2_A12255VxStMCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9AlbRecCod ;
   private int A13134VxStMNOf ;
   private int A12255VxStMCod ;
   private String AV10VxStAlmCod ;
   private String AV8VxStMAlmCod ;
   private String scmdbuf ;
   private String A12254VxStMTip ;
   private String A13135VxStAlmCod ;
   private boolean n13134VxStMNOf ;
   private boolean n13135VxStAlmCod ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05RH2_A13134VxStMNOf ;
   private boolean[] P05RH2_n13134VxStMNOf ;
   private String[] P05RH2_A12254VxStMTip ;
   private String[] P05RH2_A13135VxStAlmCod ;
   private boolean[] P05RH2_n13135VxStAlmCod ;
   private int[] P05RH2_A12255VxStMCod ;
}

final  class pvxalbealm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RH2", "SELECT StMNOf, StMTip, StMAlmCod, StMCod FROM VTXSTKMOCA WHERE StMNOf = ? ORDER BY StMTip, StMNOf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}


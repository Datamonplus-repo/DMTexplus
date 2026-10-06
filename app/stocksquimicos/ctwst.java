package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ctwst extends GXProcedure
{
   public ctwst( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ctwst.class ), "" );
   }

   public ctwst( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      ctwst.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      ctwst.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ctwst.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ctwst.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9MsgCtw = "" ;
      /* Using cursor P09PJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10936PrdCtw1 = P09PJ2_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = P09PJ2_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = P09PJ2_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = P09PJ2_A11663PrdCtw4[0] ;
         if ( GXutil.strcmp(A10936PrdCtw1, " ") != 0 )
         {
            AV9MsgCtw = httpContext.getMessage( "Formaldeido= ", "") + GXutil.trim( A10936PrdCtw1) ;
         }
         if ( GXutil.strcmp(A10937PrdCtw2, " ") != 0 )
         {
            if ( GXutil.strcmp(AV9MsgCtw, " ") != 0 )
            {
               AV9MsgCtw += "/" + httpContext.getMessage( "Arilaminas= ", "") + GXutil.trim( A10937PrdCtw2) ;
            }
            else
            {
               AV9MsgCtw = httpContext.getMessage( "Arilaminas= ", "") + GXutil.trim( A10937PrdCtw2) ;
            }
         }
         if ( GXutil.strcmp(A10938PrdCtw3, " ") != 0 )
         {
            if ( GXutil.strcmp(AV9MsgCtw, " ") != 0 )
            {
               AV9MsgCtw += "/" + httpContext.getMessage( "APEO= ", "") + GXutil.trim( A10938PrdCtw3) ;
            }
            else
            {
               AV9MsgCtw = httpContext.getMessage( "APEO= ", "") + GXutil.trim( A10938PrdCtw3) ;
            }
         }
         if ( GXutil.strcmp(A11663PrdCtw4, " ") != 0 )
         {
            if ( GXutil.strcmp(AV9MsgCtw, " ") != 0 )
            {
               AV9MsgCtw += "/" + httpContext.getMessage( "PFC= ", "") + GXutil.trim( A11663PrdCtw4) ;
            }
            else
            {
               AV9MsgCtw = httpContext.getMessage( "PFC= ", "") + GXutil.trim( A11663PrdCtw4) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ctwst.this.A396EmprCod;
      this.aP1[0] = ctwst.this.A719PrdNum;
      this.aP2[0] = ctwst.this.AV9MsgCtw;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9MsgCtw = "" ;
      scmdbuf = "" ;
      P09PJ2_A396EmprCod = new String[] {""} ;
      P09PJ2_A719PrdNum = new String[] {""} ;
      P09PJ2_A10936PrdCtw1 = new String[] {""} ;
      P09PJ2_A10937PrdCtw2 = new String[] {""} ;
      P09PJ2_A10938PrdCtw3 = new String[] {""} ;
      P09PJ2_A11663PrdCtw4 = new String[] {""} ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ctwst__default(),
         new Object[] {
             new Object[] {
            P09PJ2_A396EmprCod, P09PJ2_A719PrdNum, P09PJ2_A10936PrdCtw1, P09PJ2_A10937PrdCtw2, P09PJ2_A10938PrdCtw3, P09PJ2_A11663PrdCtw4
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String AV9MsgCtw ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PJ2_A396EmprCod ;
   private String[] P09PJ2_A719PrdNum ;
   private String[] P09PJ2_A10936PrdCtw1 ;
   private String[] P09PJ2_A10937PrdCtw2 ;
   private String[] P09PJ2_A10938PrdCtw3 ;
   private String[] P09PJ2_A11663PrdCtw4 ;
}

final  class ctwst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PJ2", "SELECT EmprCod, PrdNum, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}


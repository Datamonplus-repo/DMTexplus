package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctwst extends GXProcedure
{
   public pctwst( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctwst.class ), "" );
   }

   public pctwst( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pctwst.this.aP2 = new String[] {""};
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
      pctwst.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctwst.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pctwst.this.AV8MsgCtw = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CTW1", ""), (byte)(99), GXv_char2) ;
      pctwst.this.GXt_char1 = GXv_char2[0] ;
      AV9Lit10 = GXt_char1 ;
      GXt_char1 = AV10Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CTW2", ""), (byte)(99), GXv_char2) ;
      pctwst.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit11 = GXt_char1 ;
      GXt_char1 = AV11Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CTW3", ""), (byte)(99), GXv_char2) ;
      pctwst.this.GXt_char1 = GXv_char2[0] ;
      AV11Lit12 = GXt_char1 ;
      GXt_char1 = AV12Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CTW4", ""), (byte)(99), GXv_char2) ;
      pctwst.this.GXt_char1 = GXv_char2[0] ;
      AV12Lit13 = GXt_char1 ;
      AV8MsgCtw = "" ;
      /* Using cursor P04QJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10936PrdCtw1 = P04QJ2_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = P04QJ2_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = P04QJ2_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = P04QJ2_A11663PrdCtw4[0] ;
         if ( GXutil.strcmp(A10936PrdCtw1, " ") != 0 )
         {
            AV8MsgCtw = GXutil.trim( AV9Lit10) + "=" + GXutil.trim( A10936PrdCtw1) ;
         }
         if ( GXutil.strcmp(A10937PrdCtw2, " ") != 0 )
         {
            if ( GXutil.strcmp(AV8MsgCtw, " ") != 0 )
            {
               AV8MsgCtw += "/" + GXutil.trim( AV10Lit11) + "=" + GXutil.trim( A10937PrdCtw2) ;
            }
            else
            {
               AV8MsgCtw = GXutil.trim( AV10Lit11) + "=" + GXutil.trim( A10937PrdCtw2) ;
            }
         }
         if ( GXutil.strcmp(A10938PrdCtw3, " ") != 0 )
         {
            if ( GXutil.strcmp(AV8MsgCtw, " ") != 0 )
            {
               AV8MsgCtw += "/" + GXutil.trim( AV11Lit12) + "=" + GXutil.trim( A10938PrdCtw3) ;
            }
            else
            {
               AV8MsgCtw = GXutil.trim( AV11Lit12) + "=" + GXutil.trim( A10938PrdCtw3) ;
            }
         }
         if ( GXutil.strcmp(A11663PrdCtw4, " ") != 0 )
         {
            if ( GXutil.strcmp(AV8MsgCtw, " ") != 0 )
            {
               AV8MsgCtw += "/" + GXutil.trim( AV12Lit13) + "=" + GXutil.trim( A11663PrdCtw4) ;
            }
            else
            {
               AV8MsgCtw = GXutil.trim( AV12Lit13) + "=" + GXutil.trim( A11663PrdCtw4) ;
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
      this.aP0[0] = pctwst.this.A396EmprCod;
      this.aP1[0] = pctwst.this.A719PrdNum;
      this.aP2[0] = pctwst.this.AV8MsgCtw;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Lit10 = "" ;
      AV10Lit11 = "" ;
      AV11Lit12 = "" ;
      AV12Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P04QJ2_A396EmprCod = new String[] {""} ;
      P04QJ2_A719PrdNum = new String[] {""} ;
      P04QJ2_A10936PrdCtw1 = new String[] {""} ;
      P04QJ2_A10937PrdCtw2 = new String[] {""} ;
      P04QJ2_A10938PrdCtw3 = new String[] {""} ;
      P04QJ2_A11663PrdCtw4 = new String[] {""} ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctwst__default(),
         new Object[] {
             new Object[] {
            P04QJ2_A396EmprCod, P04QJ2_A719PrdNum, P04QJ2_A10936PrdCtw1, P04QJ2_A10937PrdCtw2, P04QJ2_A10938PrdCtw3, P04QJ2_A11663PrdCtw4
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8MsgCtw ;
   private String AV9Lit10 ;
   private String AV10Lit11 ;
   private String AV11Lit12 ;
   private String AV12Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04QJ2_A396EmprCod ;
   private String[] P04QJ2_A719PrdNum ;
   private String[] P04QJ2_A10936PrdCtw1 ;
   private String[] P04QJ2_A10937PrdCtw2 ;
   private String[] P04QJ2_A10938PrdCtw3 ;
   private String[] P04QJ2_A11663PrdCtw4 ;
}

final  class pctwst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QJ2", "SELECT EmprCod, PrdNum, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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


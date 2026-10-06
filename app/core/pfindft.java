package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfindft extends GXProcedure
{
   public pfindft( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfindft.class ), "" );
   }

   public pfindft( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      pfindft.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      pfindft.this.A396EmprCod = aP0;
      pfindft.this.AV15Mq_prog = aP1;
      pfindft.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV15Mq_prog > 0 )
      {
         AV16MacProDsc2 = httpContext.getMessage( "Error", "") ;
         AV17MacProCod = GXutil.trim( GXutil.str( AV15Mq_prog, 6, 0)) ;
         /* Using cursor P02EK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV17MacProCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1514MacProCod = P02EK2_A1514MacProCod[0] ;
            A6231MacProDsc2 = P02EK2_A6231MacProDsc2[0] ;
            A1515MacProDsc = P02EK2_A1515MacProDsc[0] ;
            AV16MacProDsc2 = A6231MacProDsc2 ;
            if ( (GXutil.strcmp("", A6231MacProDsc2)==0) )
            {
               AV16MacProDsc2 = A1515MacProDsc ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         AV16MacProDsc2 = " " ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pfindft.this.AV16MacProDsc2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16MacProDsc2 = "" ;
      AV17MacProCod = "" ;
      scmdbuf = "" ;
      P02EK2_A396EmprCod = new String[] {""} ;
      P02EK2_A1514MacProCod = new String[] {""} ;
      P02EK2_A6231MacProDsc2 = new String[] {""} ;
      P02EK2_A1515MacProDsc = new String[] {""} ;
      A1514MacProCod = "" ;
      A6231MacProDsc2 = "" ;
      A1515MacProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pfindft__default(),
         new Object[] {
             new Object[] {
            P02EK2_A396EmprCod, P02EK2_A1514MacProCod, P02EK2_A6231MacProDsc2, P02EK2_A1515MacProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15Mq_prog ;
   private String A396EmprCod ;
   private String AV16MacProDsc2 ;
   private String AV17MacProCod ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private String A6231MacProDsc2 ;
   private String A1515MacProDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02EK2_A396EmprCod ;
   private String[] P02EK2_A1514MacProCod ;
   private String[] P02EK2_A6231MacProDsc2 ;
   private String[] P02EK2_A1515MacProDsc ;
}

final  class pfindft__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EK2", "SELECT EmprCod, MacProCod, MacProDsc2, MacProDsc FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
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


package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuplamq2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuplamq2 pgm = new apuplamq2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apuplamq2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuplamq2.class ), "" );
   }

   public apuplamq2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      apuplamq2.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      apuplamq2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apuplamq2.this.AV11MaqCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Parte0 = "'" ;
      /* Using cursor P03962 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1011TipMaqCod = P03962_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P03962_n1011TipMaqCod[0] ;
         A5880PlaMTACnd = P03962_A5880PlaMTACnd[0] ;
         n5880PlaMTACnd = P03962_n5880PlaMTACnd[0] ;
         A5879PlaMTAOrd = P03962_A5879PlaMTAOrd[0] ;
         A602MaqCod = P03962_A602MaqCod[0] ;
         A1011TipMaqCod = P03962_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P03962_n1011TipMaqCod[0] ;
         if ( GXutil.strcmp(A1011TipMaqCod, httpContext.getMessage( "TN", "")) == 0 )
         {
            if ( GXutil.strcmp(GXutil.substring( A5880PlaMTACnd, 1, 9), httpContext.getMessage( "SERIEDESC", "")) == 0 )
            {
               AV13Parte1 = GXutil.substring( A5880PlaMTACnd, 1, 12) ;
               AV14Parte2 = GXutil.substring( A5880PlaMTACnd, 23, 26) ;
               A5880PlaMTACnd = GXutil.trim( AV13Parte1) + AV15Parte0 + GXutil.trim( AV14Parte2) + AV15Parte0 ;
               n5880PlaMTACnd = false ;
            }
            /* Using cursor P03963 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n5880PlaMTACnd), A5880PlaMTACnd, A396EmprCod, A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaMaq");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puplamq2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apuplamq2.this.A396EmprCod;
      this.aP1[0] = apuplamq2.this.AV11MaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apuplamq2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Parte0 = "" ;
      scmdbuf = "" ;
      P03962_A1011TipMaqCod = new String[] {""} ;
      P03962_n1011TipMaqCod = new boolean[] {false} ;
      P03962_A396EmprCod = new String[] {""} ;
      P03962_A5880PlaMTACnd = new String[] {""} ;
      P03962_n5880PlaMTACnd = new boolean[] {false} ;
      P03962_A5879PlaMTAOrd = new short[1] ;
      P03962_A602MaqCod = new String[] {""} ;
      A1011TipMaqCod = "" ;
      A5880PlaMTACnd = "" ;
      A602MaqCod = "" ;
      AV13Parte1 = "" ;
      AV14Parte2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuplamq2__default(),
         new Object[] {
             new Object[] {
            P03962_A1011TipMaqCod, P03962_n1011TipMaqCod, P03962_A396EmprCod, P03962_A5880PlaMTACnd, P03962_n5880PlaMTACnd, P03962_A5879PlaMTAOrd, P03962_A602MaqCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5879PlaMTAOrd ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV11MaqCod ;
   private String AV15Parte0 ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A602MaqCod ;
   private boolean n1011TipMaqCod ;
   private boolean n5880PlaMTACnd ;
   private String A5880PlaMTACnd ;
   private String AV13Parte1 ;
   private String AV14Parte2 ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03962_A1011TipMaqCod ;
   private boolean[] P03962_n1011TipMaqCod ;
   private String[] P03962_A396EmprCod ;
   private String[] P03962_A5880PlaMTACnd ;
   private boolean[] P03962_n5880PlaMTACnd ;
   private short[] P03962_A5879PlaMTAOrd ;
   private String[] P03962_A602MaqCod ;
}

final  class apuplamq2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03962", "SELECT T2.TipMaqCod, T1.EmprCod, T1.PlaMTACnd, T1.PlaMTAOrd, T1.MaqCod FROM (TXPPlaMaq T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = '001' ORDER BY T1.EmprCod, T1.MaqCod, T1.PlaMTAOrd ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03963", "UPDATE TXPPlaMaq SET PlaMTACnd=?  WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPlaMaq")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}


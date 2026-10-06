package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasdc2 extends GXProcedure
{
   public pfasdc2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasdc2.class ), "" );
   }

   public pfasdc2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pfasdc2.this.aP1 = new String[] {""};
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
      pfasdc2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasdc2.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasDsc2 = "" ;
      /* Using cursor P01D02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4642FasDsc2 = P01D02_A4642FasDsc2[0] ;
         n4642FasDsc2 = P01D02_n4642FasDsc2[0] ;
         AV8FasDsc2 = "" ;
         /* Using cursor P01D03 */
         pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4650FasForLin = P01D03_A4650FasForLin[0] ;
            A4652FasForTPau = P01D03_A4652FasForTPau[0] ;
            n4652FasForTPau = P01D03_n4652FasForTPau[0] ;
            A764ProForCod = P01D03_A764ProForCod[0] ;
            if ( (GXutil.strcmp("", AV8FasDsc2)==0) )
            {
               AV8FasDsc2 = GXutil.trim( A764ProForCod) + "/" + GXutil.trim( GXutil.str( A4652FasForTPau, 4, 0)) + GXutil.chr( (short)(39)) ;
            }
            else
            {
               AV9Aux_var = GXutil.trim( A764ProForCod) + "/" + GXutil.trim( GXutil.str( A4652FasForTPau, 4, 0)) + GXutil.chr( (short)(39)) ;
               AV8FasDsc2 = GXutil.concat( AV8FasDsc2, AV9Aux_var, "+") ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A4642FasDsc2 = AV8FasDsc2 ;
         n4642FasDsc2 = false ;
         /* Using cursor P01D04 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4642FasDsc2), A4642FasDsc2, A396EmprCod, A457FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasdc2.this.A396EmprCod;
      this.aP1[0] = pfasdc2.this.A457FasCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfasdc2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8FasDsc2 = "" ;
      scmdbuf = "" ;
      P01D02_A396EmprCod = new String[] {""} ;
      P01D02_A457FasCod = new String[] {""} ;
      P01D02_A4642FasDsc2 = new String[] {""} ;
      P01D02_n4642FasDsc2 = new boolean[] {false} ;
      A4642FasDsc2 = "" ;
      P01D03_A396EmprCod = new String[] {""} ;
      P01D03_A457FasCod = new String[] {""} ;
      P01D03_A4650FasForLin = new short[1] ;
      P01D03_A4652FasForTPau = new short[1] ;
      P01D03_n4652FasForTPau = new boolean[] {false} ;
      P01D03_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      AV9Aux_var = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasdc2__default(),
         new Object[] {
             new Object[] {
            P01D02_A396EmprCod, P01D02_A457FasCod, P01D02_A4642FasDsc2, P01D02_n4642FasDsc2
            }
            , new Object[] {
            P01D03_A396EmprCod, P01D03_A457FasCod, P01D03_A4650FasForLin, P01D03_A4652FasForTPau, P01D03_n4652FasForTPau, P01D03_A764ProForCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4650FasForLin ;
   private short A4652FasForTPau ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV8FasDsc2 ;
   private String scmdbuf ;
   private String A4642FasDsc2 ;
   private String A764ProForCod ;
   private String AV9Aux_var ;
   private boolean n4642FasDsc2 ;
   private boolean n4652FasForTPau ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01D02_A396EmprCod ;
   private String[] P01D02_A457FasCod ;
   private String[] P01D02_A4642FasDsc2 ;
   private boolean[] P01D02_n4642FasDsc2 ;
   private String[] P01D03_A396EmprCod ;
   private String[] P01D03_A457FasCod ;
   private short[] P01D03_A4650FasForLin ;
   private short[] P01D03_A4652FasForTPau ;
   private boolean[] P01D03_n4652FasForTPau ;
   private String[] P01D03_A764ProForCod ;
}

final  class pfasdc2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01D02", "SELECT EmprCod, FasCod, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01D03", "SELECT EmprCod, FasCod, FasForLin, FasForTPau, ProForCod FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01D04", "UPDATE TXPFASPRO SET FasDsc2=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprodc2 extends GXProcedure
{
   public pprodc2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprodc2.class ), "" );
   }

   public pprodc2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pprodc2.this.aP2 = new String[] {""};
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
      pprodc2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprodc2.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pprodc2.this.AV8ProDsc2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProDsc2 = "" ;
      /* Using cursor P01BO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5254ProDscM = P01BO2_A5254ProDscM[0] ;
         n5254ProDscM = P01BO2_n5254ProDscM[0] ;
         A4628ProDsc2 = P01BO2_A4628ProDsc2[0] ;
         A759ProDsc = P01BO2_A759ProDsc[0] ;
         if ( GXutil.strcmp(A5254ProDscM, httpContext.getMessage( "S", "")) == 0 )
         {
            A759ProDsc = A4628ProDsc2 ;
            AV8ProDsc2 = A4628ProDsc2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P01BO3 */
            pr_default.execute(1, new Object[] {A4628ProDsc2, A759ProDsc, A396EmprCod, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
            if (true) break;
         }
         AV8ProDsc2 = "" ;
         /* Using cursor P01BO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P01BO4_A457FasCod[0] ;
            A4641FasProDsc = P01BO4_A4641FasProDsc[0] ;
            n4641FasProDsc = P01BO4_n4641FasProDsc[0] ;
            A460FasDsc = P01BO4_A460FasDsc[0] ;
            A774ProNumLin = P01BO4_A774ProNumLin[0] ;
            A4641FasProDsc = P01BO4_A4641FasProDsc[0] ;
            n4641FasProDsc = P01BO4_n4641FasProDsc[0] ;
            A460FasDsc = P01BO4_A460FasDsc[0] ;
            if ( (GXutil.strcmp("", AV8ProDsc2)==0) )
            {
               if ( GXutil.strcmp(A4641FasProDsc, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV8ProDsc2 = GXutil.trim( A460FasDsc) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(A4641FasProDsc, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV8ProDsc2 = GXutil.concat( AV8ProDsc2, GXutil.trim( A460FasDsc), "/") ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A4628ProDsc2 = AV8ProDsc2 ;
         A759ProDsc = AV8ProDsc2 ;
         /* Using cursor P01BO5 */
         pr_default.execute(3, new Object[] {A4628ProDsc2, A759ProDsc, A396EmprCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprodc2.this.A396EmprCod;
      this.aP1[0] = pprodc2.this.A758ProCod;
      this.aP2[0] = pprodc2.this.AV8ProDsc2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprodc2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01BO2_A396EmprCod = new String[] {""} ;
      P01BO2_A758ProCod = new String[] {""} ;
      P01BO2_A5254ProDscM = new String[] {""} ;
      P01BO2_n5254ProDscM = new boolean[] {false} ;
      P01BO2_A4628ProDsc2 = new String[] {""} ;
      P01BO2_A759ProDsc = new String[] {""} ;
      A5254ProDscM = "" ;
      A4628ProDsc2 = "" ;
      A759ProDsc = "" ;
      P01BO4_A457FasCod = new String[] {""} ;
      P01BO4_A396EmprCod = new String[] {""} ;
      P01BO4_A758ProCod = new String[] {""} ;
      P01BO4_A4641FasProDsc = new String[] {""} ;
      P01BO4_n4641FasProDsc = new boolean[] {false} ;
      P01BO4_A460FasDsc = new String[] {""} ;
      P01BO4_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A4641FasProDsc = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprodc2__default(),
         new Object[] {
             new Object[] {
            P01BO2_A396EmprCod, P01BO2_A758ProCod, P01BO2_A5254ProDscM, P01BO2_n5254ProDscM, P01BO2_A4628ProDsc2, P01BO2_A759ProDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P01BO4_A457FasCod, P01BO4_A396EmprCod, P01BO4_A758ProCod, P01BO4_A4641FasProDsc, P01BO4_n4641FasProDsc, P01BO4_A460FasDsc, P01BO4_A774ProNumLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A774ProNumLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8ProDsc2 ;
   private String scmdbuf ;
   private String A5254ProDscM ;
   private String A4628ProDsc2 ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A4641FasProDsc ;
   private String A460FasDsc ;
   private boolean n5254ProDscM ;
   private boolean n4641FasProDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BO2_A396EmprCod ;
   private String[] P01BO2_A758ProCod ;
   private String[] P01BO2_A5254ProDscM ;
   private boolean[] P01BO2_n5254ProDscM ;
   private String[] P01BO2_A4628ProDsc2 ;
   private String[] P01BO2_A759ProDsc ;
   private String[] P01BO4_A457FasCod ;
   private String[] P01BO4_A396EmprCod ;
   private String[] P01BO4_A758ProCod ;
   private String[] P01BO4_A4641FasProDsc ;
   private boolean[] P01BO4_n4641FasProDsc ;
   private String[] P01BO4_A460FasDsc ;
   private short[] P01BO4_A774ProNumLin ;
}

final  class pprodc2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BO2", "SELECT EmprCod, ProCod, ProDscM, ProDsc2, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01BO3", "UPDATE TXPPROCES SET ProDsc2=?, ProDsc=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P01BO4", "SELECT T1.FasCod, T1.EmprCod, T1.ProCod, T2.FasProDsc, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01BO5", "UPDATE TXPPROCES SET ProDsc2=?, ProDsc=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 100);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}


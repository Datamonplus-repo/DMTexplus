package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pusuemp extends GXProcedure
{
   public pusuemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pusuemp.class ), "" );
   }

   public pusuemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pusuemp.this.aP1 = new String[] {""};
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
      pusuemp.this.AV17TermCod = aP0[0];
      this.aP0 = aP0;
      pusuemp.this.AV15EmprCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Prefijo = GXutil.substring( AV17TermCod, 1, 2) ;
      AV16UsurCod = GXutil.trim( GXutil.substring( AV17TermCod, 3, 8)) ;
      if ( GXutil.strcmp(AV18Prefijo, httpContext.getMessage( "NE", "")) == 0 )
      {
         AV21GXLvl4 = (byte)(0) ;
         n851UsurFec = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00052 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n851UsurFec), Gx_date, AV16UsurCod});
         if ( (pr_default.getStatus(0) != 101) )
         {
            AV21GXLvl4 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
         /* End optimized UPDATE. */
         if ( AV21GXLvl4 == 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV23GXLvl13 = (byte)(0) ;
         n396EmprCod = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00053 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), AV15EmprCod, AV17TermCod});
         if ( (pr_default.getStatus(1) != 101) )
         {
            AV23GXLvl13 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
         /* End optimized UPDATE. */
         if ( AV23GXLvl13 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPTERMIN

            */
            A942TermCod = AV17TermCod ;
            A396EmprCod = AV15EmprCod ;
            n396EmprCod = false ;
            A8898TermDsc = httpContext.getMessage( "PAGINA TexplusNET", "") ;
            n8898TermDsc = false ;
            A1189TermUsu = AV16UsurCod ;
            n1189TermUsu = false ;
            A11757TermEst = (byte)(1) ;
            n11757TermEst = false ;
            A11758TermFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
            n11758TermFec = false ;
            /* Using cursor P00054 */
            pr_default.execute(2, new Object[] {A942TermCod, Boolean.valueOf(n1189TermUsu), A1189TermUsu, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n8898TermDsc), A8898TermDsc, Boolean.valueOf(n11757TermEst), Byte.valueOf(A11757TermEst), Boolean.valueOf(n11758TermFec), A11758TermFec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
            if ( (pr_default.getStatus(2) == 1) )
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
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "pusuemp");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pusuemp.this.AV17TermCod;
      this.aP1[0] = pusuemp.this.AV15EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Prefijo = "" ;
      AV16UsurCod = "" ;
      Gx_date = GXutil.nullDate() ;
      A851UsurFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A942TermCod = "" ;
      A8898TermDsc = "" ;
      A1189TermUsu = "" ;
      A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pusuemp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pusuemp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pusuemp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pusuemp__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl4 ;
   private byte AV23GXLvl13 ;
   private byte A11757TermEst ;
   private short Gx_err ;
   private int GX_INS122 ;
   private String AV17TermCod ;
   private String AV15EmprCod ;
   private String AV16UsurCod ;
   private String A396EmprCod ;
   private String A942TermCod ;
   private String A8898TermDsc ;
   private String A1189TermUsu ;
   private String Gx_emsg ;
   private java.util.Date A11758TermFec ;
   private java.util.Date Gx_date ;
   private java.util.Date A851UsurFec ;
   private boolean n851UsurFec ;
   private boolean returnInSub ;
   private boolean n396EmprCod ;
   private boolean n8898TermDsc ;
   private boolean n1189TermUsu ;
   private boolean n11757TermEst ;
   private boolean n11758TermFec ;
   private String AV18Prefijo ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pusuemp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pusuemp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pusuemp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pusuemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00052", "UPDATE TXPUSUARI SET UsurFec=?  WHERE UsurCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUSUARI")
         ,new UpdateCursor("P00053", "UPDATE TXPTERMIN SET EmprCod=?  WHERE TermCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTERMIN")
         ,new UpdateCursor("P00054", "INSERT INTO TXPTERMIN(TermCod, TermUsu, EmprCod, TermDsc, TermEst, TermFec, ImpCod, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermLog1, TermLog2, TermNoTr, TermPes) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTERMIN")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 3);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               return;
      }
   }

}


package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolkmx extends GXProcedure
{
   public pcolkmx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolkmx.class ), "" );
   }

   public pcolkmx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pcolkmx.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pcolkmx.this.AV16kl_numcol = aP0[0];
      this.aP0 = aP0;
      pcolkmx.this.AV17kl_descri = aP1[0];
      this.aP1 = aP1;
      pcolkmx.this.AV22kl_tipcolp = aP2[0];
      this.aP2 = aP2;
      pcolkmx.this.AV19kl_tipcex = aP3[0];
      this.aP3 = aP3;
      pcolkmx.this.AV20kl_desing = aP4[0];
      this.aP4 = aP4;
      pcolkmx.this.AV21kl_nucoal = aP5[0];
      this.aP5 = aP5;
      pcolkmx.this.Gx_mode = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P03CZ2 */
         pr_default.execute(0, new Object[] {AV16kl_numcol, AV17kl_descri});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLKMX");
         /* End optimized DELETE. */
      }
      else
      {
         if ( GXutil.strcmp(AV22kl_tipcolp, httpContext.getMessage( "L", "")) == 0 )
         {
            AV18kl_tipcol = httpContext.getMessage( "C", "") ;
         }
         else if ( GXutil.strcmp(AV22kl_tipcolp, httpContext.getMessage( "M", "")) == 0 )
         {
            AV18kl_tipcol = httpContext.getMessage( "M", "") ;
         }
         else if ( GXutil.strcmp(AV22kl_tipcolp, httpContext.getMessage( "D", "")) == 0 )
         {
            AV18kl_tipcol = httpContext.getMessage( "O", "") ;
         }
         else
         {
            AV18kl_tipcol = httpContext.getMessage( "U", "") ;
         }
         AV27GXLvl26 = (byte)(0) ;
         n8620Kl_nucoal = false ;
         n8619Kl_desing = false ;
         n8618Kl_tipcex = false ;
         n8617Kl_tipcol = false ;
         /* Optimized UPDATE. */
         /* Using cursor P03CZ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8620Kl_nucoal), AV21kl_nucoal, Boolean.valueOf(n8619Kl_desing), AV20kl_desing, Boolean.valueOf(n8618Kl_tipcex), AV19kl_tipcex, Boolean.valueOf(n8617Kl_tipcol), AV18kl_tipcol, AV16kl_numcol, AV17kl_descri});
         if ( (pr_default.getStatus(1) != 101) )
         {
            AV27GXLvl26 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLKMX");
         /* End optimized UPDATE. */
         if ( AV27GXLvl26 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPCOLKMX

            */
            A8615Kl_numcol = AV16kl_numcol ;
            A8616Kl_descri = AV17kl_descri ;
            A8617Kl_tipcol = AV18kl_tipcol ;
            n8617Kl_tipcol = false ;
            A8618Kl_tipcex = AV19kl_tipcex ;
            n8618Kl_tipcex = false ;
            A8619Kl_desing = AV20kl_desing ;
            n8619Kl_desing = false ;
            A8620Kl_nucoal = AV21kl_nucoal ;
            n8620Kl_nucoal = false ;
            /* Using cursor P03CZ4 */
            pr_default.execute(2, new Object[] {A8615Kl_numcol, A8616Kl_descri, Boolean.valueOf(n8617Kl_tipcol), A8617Kl_tipcol, Boolean.valueOf(n8618Kl_tipcex), A8618Kl_tipcex, Boolean.valueOf(n8619Kl_desing), A8619Kl_desing, Boolean.valueOf(n8620Kl_nucoal), A8620Kl_nucoal});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLKMX");
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcolkmx.this.AV16kl_numcol;
      this.aP1[0] = pcolkmx.this.AV17kl_descri;
      this.aP2[0] = pcolkmx.this.AV22kl_tipcolp;
      this.aP3[0] = pcolkmx.this.AV19kl_tipcex;
      this.aP4[0] = pcolkmx.this.AV20kl_desing;
      this.aP5[0] = pcolkmx.this.AV21kl_nucoal;
      this.aP6[0] = pcolkmx.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcolkmx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18kl_tipcol = "" ;
      A8620Kl_nucoal = "" ;
      A8619Kl_desing = "" ;
      A8618Kl_tipcex = "" ;
      A8617Kl_tipcol = "" ;
      A8615Kl_numcol = "" ;
      A8616Kl_descri = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcolkmx__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27GXLvl26 ;
   private short Gx_err ;
   private int GX_INS1180 ;
   private String AV16kl_numcol ;
   private String AV17kl_descri ;
   private String AV22kl_tipcolp ;
   private String AV19kl_tipcex ;
   private String AV20kl_desing ;
   private String AV21kl_nucoal ;
   private String Gx_mode ;
   private String AV18kl_tipcol ;
   private String A8620Kl_nucoal ;
   private String A8619Kl_desing ;
   private String A8618Kl_tipcex ;
   private String A8617Kl_tipcol ;
   private String A8615Kl_numcol ;
   private String A8616Kl_descri ;
   private String Gx_emsg ;
   private boolean n8620Kl_nucoal ;
   private boolean n8619Kl_desing ;
   private boolean n8618Kl_tipcex ;
   private boolean n8617Kl_tipcol ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pcolkmx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03CZ2", "DELETE FROM TXPCOLKMX  WHERE Kl_numcol = ? and Kl_descri = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCOLKMX")
         ,new UpdateCursor("P03CZ3", "UPDATE TXPCOLKMX SET Kl_nucoal=?, Kl_desing=?, Kl_tipcex=?, Kl_tipcol=?  WHERE Kl_numcol = ? and Kl_descri = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCOLKMX")
         ,new UpdateCursor("P03CZ4", "INSERT INTO TXPCOLKMX(Kl_numcol, Kl_descri, Kl_tipcol, Kl_tipcex, Kl_desing, Kl_nucoal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCOLKMX")
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 2);
               stmt.setString(6, (String)parms[9], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 20);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 20);
               }
               return;
      }
   }

}


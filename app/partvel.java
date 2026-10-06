package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partvel extends GXProcedure
{
   public partvel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partvel.class ), "" );
   }

   public partvel( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          short[] aP3 ,
                          String[] aP4 )
   {
      partvel.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      partvel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partvel.this.AV8ContCod = aP1[0];
      this.aP1 = aP1;
      partvel.this.AV9ArtDsc = aP2[0];
      this.aP2 = aP2;
      partvel.this.AV10TipArtCod = aP3[0];
      this.aP3 = aP3;
      partvel.this.AV12TipArtdsc = aP4[0];
      this.aP4 = aP4;
      partvel.this.AV11ArtAcaFor = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15GXLvl2 = (byte)(0) ;
      /* Using cursor P04A02 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9ArtDsc, Short.valueOf(AV10TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10932Ve_Dsc = P04A02_A10932Ve_Dsc[0] ;
         n10932Ve_Dsc = P04A02_n10932Ve_Dsc[0] ;
         A10933Ve_TipArt = P04A02_A10933Ve_TipArt[0] ;
         n10933Ve_TipArt = P04A02_n10933Ve_TipArt[0] ;
         A10931Ve_Art = P04A02_A10931Ve_Art[0] ;
         AV15GXLvl2 = (byte)(1) ;
         AV11ArtAcaFor = A10931Ve_Art ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15GXLvl2 == 0 )
      {
         /* Execute user subroutine: 'CONTADOR' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CONTADOR' Routine */
      returnInSub = false ;
      /* Using cursor P04A03 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8ContCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A313ContCod = P04A03_A313ContCod[0] ;
         A316ContVal = P04A03_A316ContVal[0] ;
         AV11ArtAcaFor = (int)(A316ContVal+1) ;
         A316ContVal = (int)(A316ContVal+1) ;
         /* Using cursor P04A04 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /*
         INSERT RECORD ON TABLE TXPARTVEL

      */
      A10931Ve_Art = AV11ArtAcaFor ;
      A10932Ve_Dsc = AV9ArtDsc ;
      n10932Ve_Dsc = false ;
      A10933Ve_TipArt = AV10TipArtCod ;
      n10933Ve_TipArt = false ;
      A10934Ve_TipArtD = AV12TipArtdsc ;
      n10934Ve_TipArtD = false ;
      /* Using cursor P04A05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10931Ve_Art), Boolean.valueOf(n10932Ve_Dsc), A10932Ve_Dsc, Boolean.valueOf(n10933Ve_TipArt), Short.valueOf(A10933Ve_TipArt), Boolean.valueOf(n10934Ve_TipArtD), A10934Ve_TipArtD});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTVEL");
      if ( (pr_default.getStatus(3) == 1) )
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

   protected void cleanup( )
   {
      this.aP0[0] = partvel.this.A396EmprCod;
      this.aP1[0] = partvel.this.AV8ContCod;
      this.aP2[0] = partvel.this.AV9ArtDsc;
      this.aP3[0] = partvel.this.AV10TipArtCod;
      this.aP4[0] = partvel.this.AV12TipArtdsc;
      this.aP5[0] = partvel.this.AV11ArtAcaFor;
      Application.commitDataStores(context, remoteHandle, pr_default, "partvel");
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
      P04A02_A396EmprCod = new String[] {""} ;
      P04A02_A10932Ve_Dsc = new String[] {""} ;
      P04A02_n10932Ve_Dsc = new boolean[] {false} ;
      P04A02_A10933Ve_TipArt = new short[1] ;
      P04A02_n10933Ve_TipArt = new boolean[] {false} ;
      P04A02_A10931Ve_Art = new int[1] ;
      A10932Ve_Dsc = "" ;
      P04A03_A396EmprCod = new String[] {""} ;
      P04A03_A313ContCod = new String[] {""} ;
      P04A03_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      A10934Ve_TipArtD = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partvel__default(),
         new Object[] {
             new Object[] {
            P04A02_A396EmprCod, P04A02_A10932Ve_Dsc, P04A02_n10932Ve_Dsc, P04A02_A10933Ve_TipArt, P04A02_n10933Ve_TipArt, P04A02_A10931Ve_Art
            }
            , new Object[] {
            P04A03_A396EmprCod, P04A03_A313ContCod, P04A03_A316ContVal
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

   private byte AV15GXLvl2 ;
   private short AV10TipArtCod ;
   private short A10933Ve_TipArt ;
   private short Gx_err ;
   private int AV11ArtAcaFor ;
   private int A10931Ve_Art ;
   private int A316ContVal ;
   private int GX_INS1459 ;
   private String A396EmprCod ;
   private String AV8ContCod ;
   private String AV9ArtDsc ;
   private String AV12TipArtdsc ;
   private String scmdbuf ;
   private String A10932Ve_Dsc ;
   private String A313ContCod ;
   private String A10934Ve_TipArtD ;
   private String Gx_emsg ;
   private boolean n10932Ve_Dsc ;
   private boolean n10933Ve_TipArt ;
   private boolean returnInSub ;
   private boolean n10934Ve_TipArtD ;
   private int[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04A02_A396EmprCod ;
   private String[] P04A02_A10932Ve_Dsc ;
   private boolean[] P04A02_n10932Ve_Dsc ;
   private short[] P04A02_A10933Ve_TipArt ;
   private boolean[] P04A02_n10933Ve_TipArt ;
   private int[] P04A02_A10931Ve_Art ;
   private String[] P04A03_A396EmprCod ;
   private String[] P04A03_A313ContCod ;
   private int[] P04A03_A316ContVal ;
}

final  class partvel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A02", "SELECT EmprCod, Ve_Dsc, Ve_TipArt, Ve_Art FROM TXPARTVEL WHERE EmprCod = ? and Ve_Dsc = ? and Ve_TipArt = ? ORDER BY EmprCod, Ve_Dsc, Ve_TipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04A03", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04A04", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P04A05", "INSERT INTO TXPARTVEL(EmprCod, Ve_Art, Ve_Dsc, Ve_TipArt, Ve_TipArtD) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTVEL")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 26);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 30);
               }
               return;
      }
   }

}


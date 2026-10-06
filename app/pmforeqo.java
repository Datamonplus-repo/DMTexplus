package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmforeqo extends GXProcedure
{
   public pmforeqo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmforeqo.class ), "" );
   }

   public pmforeqo( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pmforeqo.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pmforeqo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmforeqo.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pmforeqo.this.AV9ForSer = aP2[0];
      this.aP2 = aP2;
      pmforeqo.this.AV10ForColNom = aP3[0];
      this.aP3 = aP3;
      pmforeqo.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      pmforeqo.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02NK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02NK2_A831TipColCod[0] ;
         A483ForColNum = P02NK2_A483ForColNum[0] ;
         A482ForColNom = P02NK2_A482ForColNom[0] ;
         A494ForSer = P02NK2_A494ForSer[0] ;
         A252CliCod = P02NK2_A252CliCod[0] ;
         A486ForNumCol = P02NK2_A486ForNumCol[0] ;
         A651ObsUltLin = P02NK2_A651ObsUltLin[0] ;
         n651ObsUltLin = P02NK2_n651ObsUltLin[0] ;
         AV13ForNumCol = A486ForNumCol ;
         AV47Obsultlin = A651ObsUltLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02NK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P02NK3_A486ForNumCol[0] ;
         A252CliCod = P02NK3_A252CliCod[0] ;
         A494ForSer = P02NK3_A494ForSer[0] ;
         A482ForColNom = P02NK3_A482ForColNom[0] ;
         A483ForColNum = P02NK3_A483ForColNum[0] ;
         A831TipColCod = P02NK3_A831TipColCod[0] ;
         AV35CliCodE = A252CliCod ;
         AV36ForSerE = A494ForSer ;
         AV37ForColNomE = A482ForColNom ;
         AV38ForColNumE = A483ForColNum ;
         AV39TipColCodE = A831TipColCod ;
         if ( ( AV8CliCod != AV35CliCodE ) || ( GXutil.strcmp(AV9ForSer, AV36ForSerE) != 0 ) || ( GXutil.strcmp(AV10ForColNom, AV37ForColNomE) != 0 ) || ( AV11ForColNum != AV38ForColNumE ) || ( AV12TipColCod != AV39TipColCodE ) )
         {
            /* Execute user subroutine: 'OBS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P02NK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13ForNumCol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = P02NK4_A486ForNumCol[0] ;
         A252CliCod = P02NK4_A252CliCod[0] ;
         A494ForSer = P02NK4_A494ForSer[0] ;
         A482ForColNom = P02NK4_A482ForColNom[0] ;
         A483ForColNum = P02NK4_A483ForColNum[0] ;
         A831TipColCod = P02NK4_A831TipColCod[0] ;
         A651ObsUltLin = P02NK4_A651ObsUltLin[0] ;
         n651ObsUltLin = P02NK4_n651ObsUltLin[0] ;
         AV35CliCodE = A252CliCod ;
         AV36ForSerE = A494ForSer ;
         AV37ForColNomE = A482ForColNom ;
         AV38ForColNumE = A483ForColNum ;
         AV39TipColCodE = A831TipColCod ;
         if ( ( AV8CliCod != AV35CliCodE ) || ( GXutil.strcmp(AV9ForSer, AV36ForSerE) != 0 ) || ( GXutil.strcmp(AV10ForColNom, AV37ForColNomE) != 0 ) || ( AV11ForColNum != AV38ForColNumE ) || ( AV12TipColCod != AV39TipColCodE ) )
         {
            A651ObsUltLin = AV47Obsultlin ;
            n651ObsUltLin = false ;
         }
         /* Using cursor P02NK5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n651ObsUltLin), Short.valueOf(A651ObsUltLin), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      /* Using cursor P02NK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCodE), AV36ForSerE, AV37ForColNomE, Integer.valueOf(AV38ForColNumE), Byte.valueOf(AV39TipColCodE)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P02NK6_A831TipColCod[0] ;
         A483ForColNum = P02NK6_A483ForColNum[0] ;
         A482ForColNom = P02NK6_A482ForColNom[0] ;
         A494ForSer = P02NK6_A494ForSer[0] ;
         A252CliCod = P02NK6_A252CliCod[0] ;
         A650ObsLin = P02NK6_A650ObsLin[0] ;
         /* Using cursor P02NK7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         System.out.println( httpContext.getMessage( "Eliminando ...", "") );
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P02NK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A649ObsForTxt = P02NK8_A649ObsForTxt[0] ;
         A650ObsLin = P02NK8_A650ObsLin[0] ;
         A831TipColCod = P02NK8_A831TipColCod[0] ;
         A483ForColNum = P02NK8_A483ForColNum[0] ;
         A482ForColNom = P02NK8_A482ForColNom[0] ;
         A494ForSer = P02NK8_A494ForSer[0] ;
         A252CliCod = P02NK8_A252CliCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         AV45OBSLIN = A650ObsLin ;
         AV46OBSFORTXT = A649ObsForTxt ;
         /*
            INSERT RECORD ON TABLE TXPLOBFOR

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         W650ObsLin = A650ObsLin ;
         W649ObsForTxt = A649ObsForTxt ;
         A252CliCod = AV35CliCodE ;
         A494ForSer = AV36ForSerE ;
         A482ForColNom = AV37ForColNomE ;
         A483ForColNum = AV38ForColNumE ;
         A831TipColCod = AV39TipColCodE ;
         A650ObsLin = AV45OBSLIN ;
         A649ObsForTxt = AV46OBSFORTXT ;
         /* Using cursor P02NK9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin), A649ObsForTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         if ( (pr_default.getStatus(7) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         A650ObsLin = W650ObsLin ;
         A649ObsForTxt = W649ObsForTxt ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmforeqo.this.A396EmprCod;
      this.aP1[0] = pmforeqo.this.AV8CliCod;
      this.aP2[0] = pmforeqo.this.AV9ForSer;
      this.aP3[0] = pmforeqo.this.AV10ForColNom;
      this.aP4[0] = pmforeqo.this.AV11ForColNum;
      this.aP5[0] = pmforeqo.this.AV12TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmforeqo");
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
      P02NK2_A396EmprCod = new String[] {""} ;
      P02NK2_A831TipColCod = new byte[1] ;
      P02NK2_A483ForColNum = new int[1] ;
      P02NK2_A482ForColNom = new String[] {""} ;
      P02NK2_A494ForSer = new String[] {""} ;
      P02NK2_A252CliCod = new int[1] ;
      P02NK2_A486ForNumCol = new int[1] ;
      P02NK2_A651ObsUltLin = new short[1] ;
      P02NK2_n651ObsUltLin = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P02NK3_A396EmprCod = new String[] {""} ;
      P02NK3_A486ForNumCol = new int[1] ;
      P02NK3_A252CliCod = new int[1] ;
      P02NK3_A494ForSer = new String[] {""} ;
      P02NK3_A482ForColNom = new String[] {""} ;
      P02NK3_A483ForColNum = new int[1] ;
      P02NK3_A831TipColCod = new byte[1] ;
      AV36ForSerE = "" ;
      AV37ForColNomE = "" ;
      P02NK4_A396EmprCod = new String[] {""} ;
      P02NK4_A486ForNumCol = new int[1] ;
      P02NK4_A252CliCod = new int[1] ;
      P02NK4_A494ForSer = new String[] {""} ;
      P02NK4_A482ForColNom = new String[] {""} ;
      P02NK4_A483ForColNum = new int[1] ;
      P02NK4_A831TipColCod = new byte[1] ;
      P02NK4_A651ObsUltLin = new short[1] ;
      P02NK4_n651ObsUltLin = new boolean[] {false} ;
      P02NK6_A396EmprCod = new String[] {""} ;
      P02NK6_A831TipColCod = new byte[1] ;
      P02NK6_A483ForColNum = new int[1] ;
      P02NK6_A482ForColNom = new String[] {""} ;
      P02NK6_A494ForSer = new String[] {""} ;
      P02NK6_A252CliCod = new int[1] ;
      P02NK6_A650ObsLin = new short[1] ;
      P02NK8_A396EmprCod = new String[] {""} ;
      P02NK8_A649ObsForTxt = new String[] {""} ;
      P02NK8_A650ObsLin = new short[1] ;
      P02NK8_A831TipColCod = new byte[1] ;
      P02NK8_A483ForColNum = new int[1] ;
      P02NK8_A482ForColNom = new String[] {""} ;
      P02NK8_A494ForSer = new String[] {""} ;
      P02NK8_A252CliCod = new int[1] ;
      A649ObsForTxt = "" ;
      W396EmprCod = "" ;
      W494ForSer = "" ;
      W482ForColNom = "" ;
      AV46OBSFORTXT = "" ;
      W649ObsForTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmforeqo__default(),
         new Object[] {
             new Object[] {
            P02NK2_A396EmprCod, P02NK2_A831TipColCod, P02NK2_A483ForColNum, P02NK2_A482ForColNom, P02NK2_A494ForSer, P02NK2_A252CliCod, P02NK2_A486ForNumCol, P02NK2_A651ObsUltLin, P02NK2_n651ObsUltLin
            }
            , new Object[] {
            P02NK3_A396EmprCod, P02NK3_A486ForNumCol, P02NK3_A252CliCod, P02NK3_A494ForSer, P02NK3_A482ForColNom, P02NK3_A483ForColNum, P02NK3_A831TipColCod
            }
            , new Object[] {
            P02NK4_A396EmprCod, P02NK4_A486ForNumCol, P02NK4_A252CliCod, P02NK4_A494ForSer, P02NK4_A482ForColNom, P02NK4_A483ForColNum, P02NK4_A831TipColCod, P02NK4_A651ObsUltLin, P02NK4_n651ObsUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02NK6_A396EmprCod, P02NK6_A831TipColCod, P02NK6_A483ForColNum, P02NK6_A482ForColNom, P02NK6_A494ForSer, P02NK6_A252CliCod, P02NK6_A650ObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02NK8_A396EmprCod, P02NK8_A649ObsForTxt, P02NK8_A650ObsLin, P02NK8_A831TipColCod, P02NK8_A483ForColNum, P02NK8_A482ForColNom, P02NK8_A494ForSer, P02NK8_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte A831TipColCod ;
   private byte AV39TipColCodE ;
   private byte W831TipColCod ;
   private short A651ObsUltLin ;
   private short AV47Obsultlin ;
   private short A650ObsLin ;
   private short AV45OBSLIN ;
   private short W650ObsLin ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV13ForNumCol ;
   private int AV35CliCodE ;
   private int AV38ForColNumE ;
   private int W252CliCod ;
   private int W483ForColNum ;
   private int GX_INS74 ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV36ForSerE ;
   private String AV37ForColNomE ;
   private String A649ObsForTxt ;
   private String W396EmprCod ;
   private String W494ForSer ;
   private String W482ForColNom ;
   private String AV46OBSFORTXT ;
   private String W649ObsForTxt ;
   private String Gx_emsg ;
   private boolean n651ObsUltLin ;
   private boolean returnInSub ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NK2_A396EmprCod ;
   private byte[] P02NK2_A831TipColCod ;
   private int[] P02NK2_A483ForColNum ;
   private String[] P02NK2_A482ForColNom ;
   private String[] P02NK2_A494ForSer ;
   private int[] P02NK2_A252CliCod ;
   private int[] P02NK2_A486ForNumCol ;
   private short[] P02NK2_A651ObsUltLin ;
   private boolean[] P02NK2_n651ObsUltLin ;
   private String[] P02NK3_A396EmprCod ;
   private int[] P02NK3_A486ForNumCol ;
   private int[] P02NK3_A252CliCod ;
   private String[] P02NK3_A494ForSer ;
   private String[] P02NK3_A482ForColNom ;
   private int[] P02NK3_A483ForColNum ;
   private byte[] P02NK3_A831TipColCod ;
   private String[] P02NK4_A396EmprCod ;
   private int[] P02NK4_A486ForNumCol ;
   private int[] P02NK4_A252CliCod ;
   private String[] P02NK4_A494ForSer ;
   private String[] P02NK4_A482ForColNom ;
   private int[] P02NK4_A483ForColNum ;
   private byte[] P02NK4_A831TipColCod ;
   private short[] P02NK4_A651ObsUltLin ;
   private boolean[] P02NK4_n651ObsUltLin ;
   private String[] P02NK6_A396EmprCod ;
   private byte[] P02NK6_A831TipColCod ;
   private int[] P02NK6_A483ForColNum ;
   private String[] P02NK6_A482ForColNom ;
   private String[] P02NK6_A494ForSer ;
   private int[] P02NK6_A252CliCod ;
   private short[] P02NK6_A650ObsLin ;
   private String[] P02NK8_A396EmprCod ;
   private String[] P02NK8_A649ObsForTxt ;
   private short[] P02NK8_A650ObsLin ;
   private byte[] P02NK8_A831TipColCod ;
   private int[] P02NK8_A483ForColNum ;
   private String[] P02NK8_A482ForColNom ;
   private String[] P02NK8_A494ForSer ;
   private int[] P02NK8_A252CliCod ;
}

final  class pmforeqo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NK2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, ObsUltLin FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NK3", "SELECT EmprCod, ForNumCol, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02NK4", "SELECT EmprCod, ForNumCol, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsUltLin FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02NK5", "UPDATE TXPCFORMU SET ObsUltLin=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P02NK6", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02NK7", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ObsLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new ForEachCursor("P02NK8", "SELECT EmprCod, ObsForTxt, ObsLin, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02NK9", "INSERT INTO TXPLOBFOR(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin, ObsForTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 30);
               return;
      }
   }

}


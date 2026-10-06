package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinteww", "/app.formulaciontinte.mtoformulastinteww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinteww extends GXWebObjectStub
{
   public mtoformulastinteww( )
   {
   }

   public mtoformulastinteww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinteww.class ));
   }

   public mtoformulastinteww( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinteww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinteww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mto Formulas Tinte";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}


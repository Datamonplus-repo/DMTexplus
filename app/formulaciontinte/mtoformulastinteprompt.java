package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinteprompt", "/app.formulaciontinte.mtoformulastinteprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinteprompt extends GXWebObjectStub
{
   public mtoformulastinteprompt( )
   {
   }

   public mtoformulastinteprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinteprompt.class ));
   }

   public mtoformulastinteprompt( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinteprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinteprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion de Formulas de Color";
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


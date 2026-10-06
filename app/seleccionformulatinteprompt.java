package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.seleccionformulatinteprompt", "/app.seleccionformulatinteprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionformulatinteprompt extends GXWebObjectStub
{
   public seleccionformulatinteprompt( )
   {
   }

   public seleccionformulatinteprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionformulatinteprompt.class ));
   }

   public seleccionformulatinteprompt( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionformulatinteprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionformulatinteprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Formulas de Color";
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


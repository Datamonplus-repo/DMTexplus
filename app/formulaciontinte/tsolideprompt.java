package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tsolideprompt", "/app.formulaciontinte.tsolideprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsolideprompt extends GXWebObjectStub
{
   public tsolideprompt( )
   {
   }

   public tsolideprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsolideprompt.class ));
   }

   public tsolideprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsolideprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsolideprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona SOLIDEZ";
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


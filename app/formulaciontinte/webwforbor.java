package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webwforbor", "/app.formulaciontinte.webwforbor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwforbor extends GXWebObjectStub
{
   public webwforbor( )
   {
   }

   public webwforbor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwforbor.class ));
   }

   public webwforbor( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwforbor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwforbor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Borrado de Formulas";
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


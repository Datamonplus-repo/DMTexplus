package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlicctr", "/app.tlicctr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlicctr extends GXWebObjectStub
{
   public tlicctr( )
   {
   }

   public tlicctr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlicctr.class ));
   }

   public tlicctr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlicctr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlicctr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Licencias";
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


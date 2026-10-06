package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.apget_probalidad", "/app.apget_probalidad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class apget_probalidad extends GXWebObjectStub
{
   public apget_probalidad( )
   {
   }

   public apget_probalidad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( apget_probalidad.class ));
   }

   public apget_probalidad( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apget_probalidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apget_probalidad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "pget_probalidad";
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


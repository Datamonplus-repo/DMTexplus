package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabados.fasqui", "/app.recetasdeacabados.fasqui"})
@jakarta.servlet.annotation.MultipartConfig
public final  class fasqui extends GXWebObjectStub
{
   public fasqui( )
   {
   }

   public fasqui( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( fasqui.class ));
   }

   public fasqui( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new fasqui_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new fasqui_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASQUI";
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


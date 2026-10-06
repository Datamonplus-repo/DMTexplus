package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_analisishdr", "/app.ingenieria.mrec_analisishdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_analisishdr extends GXWebObjectStub
{
   public mrec_analisishdr( )
   {
   }

   public mrec_analisishdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_analisishdr.class ));
   }

   public mrec_analisishdr( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_analisishdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_analisishdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis PLCs HDR";
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


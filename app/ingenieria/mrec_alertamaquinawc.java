package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_alertamaquinawc", "/app.ingenieria.mrec_alertamaquinawc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_alertamaquinawc extends GXWebObjectStub
{
   public mrec_alertamaquinawc( )
   {
   }

   public mrec_alertamaquinawc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_alertamaquinawc.class ));
   }

   public mrec_alertamaquinawc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_alertamaquinawc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_alertamaquinawc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aletas máquina";
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


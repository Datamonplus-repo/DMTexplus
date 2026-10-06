package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.modificarsituacionhdr", "/app.pedidosclientesindetalle.modificarsituacionhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class modificarsituacionhdr extends GXWebObjectStub
{
   public modificarsituacionhdr( )
   {
   }

   public modificarsituacionhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( modificarsituacionhdr.class ));
   }

   public modificarsituacionhdr( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new modificarsituacionhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new modificarsituacionhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificar Situacion Hdr";
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


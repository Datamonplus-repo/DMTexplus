package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidoalmacentejidoprompt", "/app.nwdpalmacentejidoalmacentejidoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidoalmacentejidoprompt extends GXWebObjectStub
{
   public nwdpalmacentejidoalmacentejidoprompt( )
   {
   }

   public nwdpalmacentejidoalmacentejidoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidoalmacentejidoprompt.class ));
   }

   public nwdpalmacentejidoalmacentejidoprompt( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidoalmacentejidoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidoalmacentejidoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Almacen Tejido";
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


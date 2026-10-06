package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.enviodocumentodesdetalbnop", "/app.enviodocumentodesdetalbnop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class enviodocumentodesdetalbnop extends GXWebObjectStub
{
   public enviodocumentodesdetalbnop( )
   {
   }

   public enviodocumentodesdetalbnop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( enviodocumentodesdetalbnop.class ));
   }

   public enviodocumentodesdetalbnop( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new enviodocumentodesdetalbnop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new enviodocumentodesdetalbnop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio Documento Desde TalbNop";
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


package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_header_trn", "/app.trabajosexternos.trabajoexterno_header_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_header_trn extends GXWebObjectStub
{
   public trabajoexterno_header_trn( )
   {
   }

   public trabajoexterno_header_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_header_trn.class ));
   }

   public trabajoexterno_header_trn( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_header_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_header_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajo Externo (Header)";
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


package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_header_trnww", "/app.trabajosexternos.trabajoexterno_header_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_header_trnww extends GXWebObjectStub
{
   public trabajoexterno_header_trnww( )
   {
   }

   public trabajoexterno_header_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_header_trnww.class ));
   }

   public trabajoexterno_header_trnww( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_header_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_header_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Trabajo Externo (Header)";
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


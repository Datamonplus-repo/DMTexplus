package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_informeficheroresult", "/app.trabajosexternos.trabajoexterno_informeficheroresult"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_informeficheroresult extends GXWebObjectStub
{
   public trabajoexterno_informeficheroresult( )
   {
   }

   public trabajoexterno_informeficheroresult( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_informeficheroresult.class ));
   }

   public trabajoexterno_informeficheroresult( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_informeficheroresult_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_informeficheroresult_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Fichero RESULT.xml";
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


package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentos__wcexportreport", "/app.entradarecuentos__wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentos__wcexportreport extends GXWebObjectStub
{
   public entradarecuentos__wcexportreport( )
   {
   }

   public entradarecuentos__wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentos__wcexportreport.class ));
   }

   public entradarecuentos__wcexportreport( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentos__wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentos__wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Recuentos__WCExport Report";
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

